package surname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SurnamesMachine {
	
	public static void printSurnameInAllCases(String surname) {
		for(Case grammaticalCase : Case.values()) {
			String casedSurname = getSurnameInCase(surname, grammaticalCase);
			System.out.println(grammaticalCase + ": " + casedSurname);
		}
	}
	
	public static String getSurnameInCase(String surname, Case grammaticalCase) {
		for(Suffix suffix : SurnamesDatabase.suffixes) {
			Pattern surnamePattern = Pattern.compile("(\\p{L}*|\\p{L}*-\\p{L}*)" + suffix.getSuffixInCase(Case.MIANOWNIK));
			Matcher matcher = surnamePattern.matcher(surname);
			if(matcher.matches()) {
				return matcher.group(1) + suffix.getSuffixInCase(grammaticalCase);
			}
		}
		return surname;
	}
	
}
