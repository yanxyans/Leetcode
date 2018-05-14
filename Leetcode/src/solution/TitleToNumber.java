package solution;

public class TitleToNumber {
	public int titleToNumber(String s) {
		int num = 0;
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			num *= 26;
			num += s.charAt(i) - 'A' + 1;
		}
		
		return num;
	}
}
