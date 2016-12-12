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

	public static String getCorrectedText(String text) {
		for(String regex : CorrectorDatabase.regexes.keySet()) {
			if(text.contains(regex)) {
				text = text.replace(regex, CorrectorDatabase.regexes.get(regex));
			}
		}
		return text;
	}
	
	public static String getCorrectedText2(String text) {
		text = text.replaceAll(" {2,}", " ");
		
		List<String> wordsInText = getWordsInLine(text);
		for(String word : wordsInText) {
			if(!listOfAllWords.contains(word) && listOfAllWords.contains(word.substring(0, 1).toUpperCase() + word.substring(1))) {
				text = text.replaceAll("\\b" + word + "\\b", word.substring(0, 1).toUpperCase() + word.substring(1));
			}
			else if(!listOfAllWords.contains(word) && !listOfAllWords.contains(word.toLowerCase())) {
				// wyszukanie słowa różniącego się jedną literą
				text = text.replaceAll("\\b" + word + "\\b", "BŁĄD");
			}
		}
		
		Pattern pattern2 = Pattern.compile("morze (się |)(\\p{L}+(ć|c))");
		Matcher matcher2 = pattern2.matcher(text);
		if(matcher2.find()) {
			text = text.replaceAll("morze (się |)\\p{L}+(ć|c)", "może " + matcher2.group(1) + matcher2.group(2));
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
			List<String> lines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/res/odm.txt"));
			
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
		for(String similarWord : listOfAllWords) {
			int length = Math.min(word.length(), similarWord.length());
			int counter = 0;
			for(int i=0; i<length; i++) {
				if(word.charAt(i) != similarWord.charAt(i)) {
					counter++;
				}
			}
			if(counter > 2) {
				continue;
			}
			else {
				return similarWord;
			}
		}
		return word;
	}
	
}
