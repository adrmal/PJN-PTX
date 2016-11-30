package surname;

import java.util.ArrayList;
import java.util.List;

public class SurnamesDatabase {
	
	public static List<Suffix> suffixes = new ArrayList<>();
	
	static {
		suffixes.add(new Suffix(new String[] { "ski", "skiego", "skiemu", "skiego", "skim", "skim", "ski" }));
		suffixes.add(new Suffix(new String[] { "ska", "skiej", "skiej", "ską", "ską", "skiej", "ska" }));
		suffixes.add(new Suffix(new String[] { "niek", "ńka", "ńkowi", "ńka", "ńkiem", "ńku", "ńku" }));
		suffixes.add(new Suffix(new String[] { "ek", "ka", "kowi", "ka", "kiem", "ku", "ku" }));
		suffixes.add(new Suffix(new String[] { "k", "ka", "kowi", "ka", "kiem", "ku", "ku" }));
		suffixes.add(new Suffix(new String[] { "cki", "ckiego", "ckiemu", "ckiego", "ckim", "ckim", "cki" }));
		suffixes.add(new Suffix(new String[] { "cka", "ckiej", "ckiej", "cką", "cką", "ckiej", "cka" }));
		suffixes.add(new Suffix(new String[] { "ka", "ki", "ce", "kę", "ką", "ce", "ko" }));
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
		suffixes.add(new Suffix(new String[] { "y", "ego", "emu", "ego", "ym", "ym", "y" }));
		suffixes.add(new Suffix(new String[] { "iel", "iela", "ielowi", "iela", "ielem", "ielu", "ielu" }));
		suffixes.add(new Suffix(new String[] { "tel", "tela", "telowi", "tela", "telem", "telu", "telu" }));
		suffixes.add(new Suffix(new String[] { "el", "la", "lowi", "la", "lem", "lu", "lu" }));
		suffixes.add(new Suffix(new String[] { "l", "la", "lowi", "la", "lem", "lu", "lu" }));
		suffixes.add(new Suffix(new String[] { "g", "ga", "gowi", "ga", "giem", "gu", "gu" }));
		suffixes.add(new Suffix(new String[] { "b", "ba", "bowi", "ba", "bem", "bie", "bie" }));
		suffixes.add(new Suffix(new String[] { "li", "lego", "lemu", "lego", "lim", "lim", "li" }));
		suffixes.add(new Suffix(new String[] { "i", "iego", "iemu", "iego", "im", "im", "i" }));
		suffixes.add(new Suffix(new String[] { "óć", "ocia", "ociowi", "ocia", "ociem", "ociu", "ociu" }));
		suffixes.add(new Suffix(new String[] { "óń", "onia", "oniowi", "onia", "oniem", "oniu", "oniu" }));
		suffixes.add(new Suffix(new String[] { "ć", "cia", "ciowi", "cia", "ciem", "ciu", "ciu" }));
		suffixes.add(new Suffix(new String[] { "ń", "nia", "niowi", "nia", "niem", "niu", "niu" }));
		suffixes.add(new Suffix(new String[] { "óź", "ozia", "oziowi", "ozia", "oziem", "oziu", "oziu" }));
		suffixes.add(new Suffix(new String[] { "ź", "ozia", "oziowi", "ozia", "oziem", "oziu", "oziu" }));
		suffixes.add(new Suffix(new String[] { "óż", "oża", "ożowi", "oża", "ożem", "ożu", "ożu" }));
		suffixes.add(new Suffix(new String[] { "ż", "oża", "ożowi", "oża", "ożem", "ożu", "ożu" }));
		suffixes.add(new Suffix(new String[] { "ół", "oła", "ołowi", "oła", "ołem", "ole", "ole" }));
		suffixes.add(new Suffix(new String[] { "ł", "ła", "łowi", "ła", "łem", "le", "le" }));
		suffixes.add(new Suffix(new String[] { "rz", "rza", "rzowi", "rza", "rzem", "rzu", "rzu" }));
		suffixes.add(new Suffix(new String[] { "t", "ta", "towi", "ta", "tem", "cie", "cie" }));
		suffixes.add(new Suffix(new String[] { "s", "sa", "sowi", "sa", "sem", "sie", "sie" }));
		suffixes.add(new Suffix(new String[] { "ów", "owa", "owowi", "owa", "owem", "owie", "owie" }));
		suffixes.add(new Suffix(new String[] { "w", "wa", "wowi", "wa", "wem", "wie", "wie" }));
		
	}
	
}
