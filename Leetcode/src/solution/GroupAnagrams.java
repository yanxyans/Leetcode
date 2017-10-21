package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	Map<String, Integer> seen = new HashMap<String, Integer>();
    	List<List<String>> ret = new ArrayList<List<String>>();
    	
        for (String s : strs) {
        	int len = s.length();
        	
        	// count frequency of characters
        	int[] freq = new int[26];
        	for (int i = 0; i < len; i++) {
        		char c = s.charAt(i);
        		freq[c - 'a']++;
        	}
        	
        	// convert to usable key
        	String key = Arrays.toString(freq);
        	
        	if (seen.containsKey(key)) {
        		ret.get(seen.get(key)).add(s);
        	} else {
        		// add new anagram group
        		int index = ret.size();
        		List<String> group = new ArrayList<String>();
        		group.add(s);
        		ret.add(group);
        		
        		seen.put(key, index);
        	}
        }
        
        return ret;
    }
}
