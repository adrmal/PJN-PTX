package corrector;

import java.util.HashMap;
import java.util.Map;

public class CorrectorDatabase {

	public static Map<String, String> regexes = new HashMap<>();
	
	static {
		regexes.put("ktury", "który");
		regexes.put("kturego", "którego");
		regexes.put("kturemu", "któremu");
		regexes.put("kturym", "którym");
		regexes.put("ktory", "który");
		regexes.put("ktorego", "którego");
		regexes.put("ktoremu", "któremu");
		regexes.put("ktorym", "którym");
		regexes.put("ktura", "która");
		regexes.put("kturej", "której");
		regexes.put("kturą", "którą");
		regexes.put("ktora", "która");
		regexes.put("ktorej", "której");
		regexes.put("ktorą", "którą");
		regexes.put("kture", "które");
		regexes.put("ktore", "które");
		regexes.put("kturych", "których");
		regexes.put("kturymi", "którymi");
		regexes.put("ktorych", "których");
		regexes.put("ktorymi", "którymi");
		regexes.put("kturzy", "którzy");
		regexes.put("ktorzy", "którzy");
		
	}
	
}
