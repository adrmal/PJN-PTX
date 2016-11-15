package surname;

import java.util.Arrays;
import java.util.List;

public class Suffix {

	private List<String> casesOfSuffix;
	
	public Suffix(String... casesOfSuffix) {
		this.casesOfSuffix = Arrays.asList(casesOfSuffix);
	}
	
	public String getCase(int index) {
		return casesOfSuffix.get(index);
	}
	
	public String getCase(Case grammaticalCase) {
		return casesOfSuffix.get(grammaticalCase.ordinal());
	}
	
}
