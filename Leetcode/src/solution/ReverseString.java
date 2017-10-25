package solution;

public class ReverseString {
    public String reverseString(String s) {
        int n = s.length();
        
        StringBuilder rev = new StringBuilder();
        for (int i = n - 1; i > -1; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}
