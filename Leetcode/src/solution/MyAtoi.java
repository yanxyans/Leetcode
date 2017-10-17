package solution;

public class MyAtoi {
	public int myAtoi(String str) {
		int ret = 0;
		int len = str.length();
		
		int i = 0;
		boolean isNegative = false;
		while (i < len) {
			char c = str.charAt(i);
			if (c == '-') {
				i++;
				isNegative = true;
				break;
			} else if (c == '+') {
                i++;
                break;
            } else if (Character.isDigit(c)) {
				break;
			} else if (c == ' ') {
                i++;
            } else {
                return ret;
            }
		}
		
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				int d = (int)(c - '0');
				
				int preAppend = ret;
				int postAppend = (ret * 10) + (isNegative ? -d : d);
				
				// overflow check
				if (isNegative) {
					if (preAppend < (Integer.MIN_VALUE + d) / 10) {
						return Integer.MIN_VALUE;
					}
				} else {
					if (preAppend > (Integer.MAX_VALUE - d) / 10) {
						return Integer.MAX_VALUE;
					}
				}
				
				ret = postAppend;
			} else {
                return ret;
            }
		}
		
		return ret;
	}
}
