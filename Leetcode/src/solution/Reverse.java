package solution;

public class Reverse {
    public int reverse(int x) {
    	if (x == Integer.MIN_VALUE) {
    		return 0;
    	}
    	
        boolean isNegative = x < 0;
        
        int digits = Math.abs(x);
        int reversedDigits = 0;
        while (digits > 0) {
        	int preAppend = reversedDigits;
        	int toAppend = digits % 10;
        	
        	reversedDigits = (reversedDigits * 10) + toAppend;
            if ((reversedDigits - toAppend) / 10 != preAppend) {
                return 0;
            }
            
            digits /= 10;
        }
        
        return isNegative ? -reversedDigits : reversedDigits;
    }
}