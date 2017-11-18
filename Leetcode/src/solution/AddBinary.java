package solution;

import java.util.Arrays;

public class AddBinary {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        
        if (m < n) {
        	String tmp = a;
        	a = b;
        	b = tmp;
        	
        	int o = m;
        	m = n;
        	n = o;
        }
        
        
        char[] ret = new char[m];
        int carry = 0;
        for (int i = n - 1; i > -1; i--) {
        	int j = m - 1 - n + 1 + i;
        	
        	int aval = a.charAt(j) - '0';
        	int bval = b.charAt(i) - '0';
        	ret[j] = (char) ((aval ^ bval ^ carry) + '0');
        	carry = (aval & bval) | (aval & carry) | (bval & carry);
        }
        int i = m - n - 1;
        while (i > -1) {
        	if (carry > 0) {
	        	ret[i] = (char) (('1' - a.charAt(i)) + '0');
	        	carry = a.charAt(i) - '0';
        	} else {
        		ret[i] = a.charAt(i);
        	}
        	i--;
        }
        
        String c = new String(ret);
        return carry > 0 ? '1' + c : c;
    }
}
