package solution;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] ret = new int[m + n];
        
        for (int i = m - 1; i > -1; i--) {
        	for (int j = n - 1; j > -1; j--) {
        		int val = (num1.charAt(j) - '0') * (num2.charAt(i) - '0') + ret[i + j + 1];
        		ret[i + j + 1] = val % 10;
        		ret[i + j] = val / 10;
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < m + n && ret[i] == 0) {
        	i++;
        }
        for (; i < m + n; i++) {
        	sb.append(ret[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
