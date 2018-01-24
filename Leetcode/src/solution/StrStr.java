package solution;

public class StrStr {

	public int strStr(String haystack, String needle) {
		int m = haystack.length();
		int n = needle.length();
		
		for (int i = 0; i <= m - n; i++) {
			
			int j;
			for (j = 0; j < n; j++) {
				if (haystack.charAt(j + i) != needle.charAt(j)) {
					break;
				}
			}
			
			if (j == n) {
				return i;
			}
		}
		
		return -1;
	}

}
