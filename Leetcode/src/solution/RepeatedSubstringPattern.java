package solution;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        int i = 0;
        for (int j = n / 2; j > 0; j--) {
        	if (n % j == 0) {
        		int reps = n / j;
        		String t = s.substring(i, j);
        		StringBuilder sb = new StringBuilder();
        		for (int k = 0; k < reps; k++) {
        			sb.append(t);
        		}
        		
        		if (sb.toString().equals(s)) {
        			return true;
        		}
        	}
        }
        
        return false;
    }

}
