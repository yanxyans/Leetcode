package solution;

import java.util.Arrays;

public class AllUnique {
	public boolean allUnique(String s) {
		
		char[] chr = s.toCharArray();
		Arrays.sort(chr);
		
		for (int i = 1; i < chr.length; i++) {
			if (chr[i] == chr[i - 1])
				return false;
		}
		
		return true;
	}
}
