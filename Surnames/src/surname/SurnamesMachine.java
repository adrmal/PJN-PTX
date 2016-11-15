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
			Pattern p = Pattern.compile("([A-Za-zAĆĘŁŃÓŚŹŻąćęłńóśźż]+)" + suffix.getCase(Case.MIANOWNIK));
			Matcher m = p.matcher(surname);
			if(m.matches()) {
				return m.group(1) + suffix.getCase(grammaticalCase);
			}
		}
		return null;
	}
	
}
