package surname;

import java.util.ArrayList;
import java.util.List;

public class SurnamesDatabase {
	
	public static List<Suffix> suffixes = new ArrayList<>();
	
	static {
		suffixes.add(new Suffix(new String[] { "ski", "skiego", "skiemu", "skiego", "skim", "skim", "ski" }));
		suffixes.add(new Suffix(new String[] { "ska", "skiej", "skiej", "ską", "ską", "skiej", "ska" }));
		suffixes.add(new Suffix(new String[] { "ak", "aka", "akowi", "aka", "akiem", "aku", "aku" }));
		suffixes.add(new Suffix(new String[] { "niek", "ńka", "ńkowi", "ńka", "ńkiem", "ńku", "ńku" }));
		suffixes.add(new Suffix(new String[] { "ek", "ka", "kowi", "ka", "kiem", "ku", "ku" }));
		suffixes.add(new Suffix(new String[] { "yk", "yka", "ykowi", "yka", "ykiem", "yku", "yku" }));
		suffixes.add(new Suffix(new String[] { "ik", "ika", "ikowi", "ika", "ikiem", "iku", "iku" }));
		suffixes.add(new Suffix(new String[] { "cki", "ckiego", "ckiemu", "ckiego", "ckim", "ckim", "cki" }));
		suffixes.add(new Suffix(new String[] { "cka", "ckiej", "ckiej", "cką", "cką", "ckiej", "cka" }));
		suffixes.add(new Suffix(new String[] { "ła", "ły", "le", "łę", "łą", "le", "ło" }));
		suffixes.add(new Suffix(new String[] { "ra", "ry", "rze", "rę", "rą", "rze", "ro" }));
		suffixes.add(new Suffix(new String[] { "ke", "kego", "kemu", "kego", "kem", "kem", "ke" }));
		suffixes.add(new Suffix(new String[] { "ko", "ki", "ce", "kę", "ką", "ce", "ko" }));
		suffixes.add(new Suffix(new String[] { "h", "ha", "howi", "ha", "hem", "hu", "hu" }));
		suffixes.add(new Suffix(new String[] { "cz", "cza", "czowi", "cza", "czem", "czu", "czu" }));
		suffixes.add(new Suffix(new String[] { "r", "ra", "rowi", "ra", "rem", "rze", "rze" }));
		suffixes.add(new Suffix(new String[] { "niec", "ńca", "ńcowi", "ńca", "ńcem", "ńcu", "ńcu" }));
		suffixes.add(new Suffix(new String[] { "iec", "ca", "cowi", "ca", "cem", "cu", "cu" }));
		suffixes.add(new Suffix(new String[] { "ec", "ca", "cowi", "ca", "cem", "cu", "cu" }));
		suffixes.add(new Suffix(new String[] { "c", "ca", "cowi", "ca", "cem", "cu", "cu" }));
		suffixes.add(new Suffix(new String[] { "cha", "chy", "sze", "chę", "chą", "sze", "cho" }));
		suffixes.add(new Suffix(new String[] { "óz", "oza", "ozowi", "oza", "ozem", "ozie", "ozie" }));
		suffixes.add(new Suffix(new String[] { "da", "dy", "dzie", "dę", "dą", "dzie", "do" }));
		suffixes.add(new Suffix(new String[] { "n", "na", "nowi", "na", "nem", "nie", "nie" }));
		suffixes.add(new Suffix(new String[] { "ś", "sia", "siowi", "sia", "siem", "siu", "siu" }));
	}
	
}
