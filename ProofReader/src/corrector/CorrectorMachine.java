package corrector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectorMachine {

	private static List<String> listOfAllWords;
	
	public static String getCorrectedText2(String text) {
		text = text.replaceAll(" {2,}", " ");
		text = text.replaceAll(" +\\.", "\\.");
		text = text.replaceAll(" +,", ",");
		text = text.replaceAll(" +;", ";");
		
		Pattern pattern = Pattern.compile("\\.(\\p{L})");
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			text = text.replaceAll("\\." + matcher.group(1), ". " + matcher.group(1));
		}
		
		Pattern pattern1 = Pattern.compile(",(\\p{L})");
		Matcher matcher1 = pattern1.matcher(text);
		while(matcher1.find()) {
			text = text.replaceAll("," + matcher1.group(1), ", " + matcher1.group(1));
		}
		
		Pattern pattern4 = Pattern.compile(";(\\p{L})");
		Matcher matcher4 = pattern4.matcher(text);
		while(matcher4.find()) {
			text = text.replaceAll(";" + matcher4.group(1), "; " + matcher4.group(1));
		}
		
		Pattern pattern2 = Pattern.compile("\\. (\\p{Ll})");
		Matcher matcher2 = pattern2.matcher(text);
		while(matcher2.find()) {
			text = text.replaceAll("\\. " + matcher2.group(1), ". " + matcher2.group(1).toUpperCase());
		}		
		
		text = text.replaceAll("\\bsie\\b", "się");
		text = text.replaceAll("\\bSie\\b", "Się");
		text = text.replaceAll("\\bbede\\b|\\bbęde\\b|\\bbedę\\b", "będę");
		text = text.replaceAll("\\bBede\\b|\\bBęde\\b|\\bBedę\\b", "Będę");
		text = text.replaceAll("w każdym bądź razie", "w każdym razie");
		text = text.replaceAll("W każdym bądź razie", "W każdym razie");
		text = text.replaceAll("ojedyńcz", "ojedyncz");
		text = text.replaceAll("narazie", "na razie");
		text = text.replaceAll("Narazie", "Na razie");
		text = text.replaceAll("wogóle", "w ogóle");
		text = text.replaceAll("Wogóle", "W ogóle");
		
		text = text.replaceAll("miedzy", "między");
		Pattern pattern5 = Pattern.compile("(zza|Zza|do|Do|od|Od|przy|Przy|z|Z|na|Na|po|Po) między");
		Matcher matcher5 = pattern5.matcher(text);
		while(matcher5.find()) {
			text = text.replaceAll(matcher5.group(1) + " między", matcher5.group(1) + " miedzy");
		}	
		
		List<String> wordsInText = getWordsInLine(text);
		for(String word : wordsInText) {
			if(!listOfAllWords.contains(word) && listOfAllWords.contains(word.substring(0, 1).toUpperCase() + word.substring(1))) {
				text = text.replaceAll("\\b" + word + "\\b", word.substring(0, 1).toUpperCase() + word.substring(1));
			}
			else if(!listOfAllWords.contains(word) && !listOfAllWords.contains(word.toLowerCase())) {
				String similarWord = getSimilarWord(word);
				text = text.replaceAll("\\b" + word + "\\b", similarWord);
			}
		}
		
		Pattern pattern3 = Pattern.compile("(m|M)orze (się |)(\\p{L}+(ć|c))");
		Matcher matcher3 = pattern3.matcher(text);
		while(matcher3.find()) {
			text = text.replaceAll(matcher3.group(1) + "orze " + matcher3.group(2) + matcher3.group(3), matcher3.group(1) + "oże " + matcher3.group(2) + matcher3.group(3));
		}

		return text;
	}

	public static void initializeListOfAllWords() {
		try {
			String path = System.getProperty("user.dir");
			if(path.contains("/")) {
				path = path + "/res/odm.txt";
			}
			else {
				path = path + "\\res\\odm.txt";
			}
			System.out.println(path);
			List<String> lines = Files.readAllLines(Paths.get(path));
			
			listOfAllWords = new ArrayList<>();
	
			for(String line : lines) {
				List<String> words = getWordsInLine(line);
				listOfAllWords.addAll(words);
			}
			System.out.println("\nINICJALIZACJA ZAKOŃCZONA\n\n=================================\n");
		}
		catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static List<String> getWordsInLine(String line) {
		Pattern pattern = Pattern.compile("\\b\\p{L}+\\b");

		List<String> words = new ArrayList<String>();
 		Matcher m = pattern.matcher(line);
 		while(m.find()) {
   			words.add(m.group());
 		}

		return words;
	}

	private static String getSimilarWord(String word) {
		if(word.contains("u")) {
			word = word.replace("u", "ó");
		}
		else if(word.contains("ó")) {
			word = word.replace("ó", "u");
		}
		if(listOfAllWords.contains(word)) {
			return word;
		}
		
		if(word.contains("ż")) {
			word = word.replace("ż", "rz");
		}
		else if(word.contains("rz")) {
			word = word.replace("rz", "ż");
		}
		if(listOfAllWords.contains(word)) {
			return word;
		}
		
		if(word.contains("h")) {
			word = word.replace("h", "ch");
		}
		else if(word.contains("ch")) {
			word = word.replace("ch", "h");
		}
		if(listOfAllWords.contains(word)) {
			return word;
		}

		return word;
	}
	
}
