package solution;

import java.util.HashSet;
import java.util.Set;

public class AllUnique {
	public boolean allUnique(String s) {
		Set<Character> seen = new HashSet<Character>();
		int n = s.length();
		
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (seen.contains(c))
				return false;
			
			seen.add(c);
		}
		
		return true;
	}
}
