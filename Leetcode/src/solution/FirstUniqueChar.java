package solution;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
        	char c = s.charAt(i);
        	if (freq.containsKey(c))
        		freq.put(c, freq.get(c) + 1);
        	else
        		freq.put(c, 1);
        }
        
        for (int i = 0; i < n; i++) {
        	char c = s.charAt(i);
        	if (freq.get(c) == 1)
        		return i;
        }
        
        return -1;
    }
}
