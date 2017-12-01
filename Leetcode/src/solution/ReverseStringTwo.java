package solution;

public class ReverseStringTwo {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i += 2*k) {
        	int j = Math.min(i + k - 1, len - 1);
        	for (; j > i - 1; j--)
        		sb.append(s.charAt(j));
        	j = i + k;
        	for (; j < i + 2*k && j < len; j++)
        		sb.append(s.charAt(j));
        }
        return sb.toString();
    }
}
