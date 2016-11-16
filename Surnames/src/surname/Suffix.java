package surname;

import java.util.Arrays;
import java.util.List;

public class Suffix {

	private List<String> suffixCases;
	
	public Suffix(String... suffixCases) {
		this.suffixCases = Arrays.asList(suffixCases);
	}
	
	public String getSuffixInCase(Case grammaticalCase) {
		return suffixCases.get(grammaticalCase.ordinal());
	}
	
}
