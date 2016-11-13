package surname;

public class SurnamesMachine {
	
	public static void printSurnameInAllCases(String surname) {
		for(Case grammaticalCase : Case.values()) {
			String casedSurname = getSurnameInCase(surname, grammaticalCase);
			System.out.println(grammaticalCase + ": " + casedSurname);
		}
	}
	
	public static String getSurnameInCase(String surname, Case grammaticalCase) {
		return null;
	}
	
}
