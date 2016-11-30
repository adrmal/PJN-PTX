package corrector;

public class CorrectorMachine {

	public static String getCorrectedText(String text) {
		for(String regex : CorrectorDatabase.regexes.keySet()) {
			if(text.contains(regex)) {
				text = text.replace(regex, CorrectorDatabase.regexes.get(regex));
			}
		}
		return text;
	}
	
}
