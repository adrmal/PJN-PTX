package corrector;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectorMachine {

	private List<String> listOfAllWords;

	public static String getCorrectedText(String text) {
		for(String regex : CorrectorDatabase.regexes.keySet()) {
			if(text.contains(regex)) {
				text = text.replace(regex, CorrectorDatabase.regexes.get(regex));
			}
		}
		return text;
	}
	
	public static String getCorrectedText2(String text) {
		Pattern pattern = Pattern.compile("\\b\\p{L}+\\b");

		List<String> wordsInText = getWordsInLine(text);
		for(String word : wordsInText) {
			if(!listOfAllWords.contains(word)) {
				// wyszukanie słowa różniącego się jedną literą
				text.replaceAll("\\b" + word + "\\b", similarWord);
			}
		}

		return text;
	}

	public static void initializeListOfAllWords() {
		// otwarcie pliku

		listOfAllWords = new ArrayList<>();

		while(file.hasNextLine()) {
			List<String> words = getWordsInLine(file.nextLine());
			listOfAllWords.addAll(words);
		}
	}

	private static List<String> getWordsInLine(String line) {
		Pattern pattern = Pattern.compile("\\b\\p{L}+\\b");

		List<String> words = new ArrayList<String>();
 		Matcher m = pattern.matcher(text);
 		while(m.find()) {
   			words.add(m.group());
 		}

		return words;
	}

}
