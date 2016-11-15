package surname;

import java.util.ArrayList;
import java.util.List;

public class SurnamesDatabase {
	
	public static List<Suffix> suffixes = new ArrayList<>();
	
	static {
		suffixes.add(new Suffix(new String[] { "ski", "skiego", "skiemu", "skiego", "skim", "skim", "ski" }));
		suffixes.add(new Suffix(new String[] { "ak", "aka", "akowi", "aka", "akiem", "aku", "aku" }));
	}
	
}
