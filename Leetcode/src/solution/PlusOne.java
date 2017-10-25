package solution;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int i = digits.length - 1;
        while (carry > 0 && i > -1) {
            int val = digits[i] + carry;
            digits[i--] = val % 10;
            carry = val / 10;
        }
        
        if (carry > 0) {
            int[] ret = new int[digits.length + 1];
            ret[0] = carry;
            for (int j = 1; j < digits.length + 1; j++) {
                ret[j] = digits[j - 1];
            }
            return ret;
        }
        return digits;
    }
}
