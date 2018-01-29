package solution;

import java.util.HashMap;
import java.util.Map;

public class AnagramMapping {
    public int[] anagramMappings(int[] A, int[] B) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	int n = A.length;
        for (int i = 0; i < n; i++) {
        	if (!map.containsKey(B[i])) {
        		map.put(B[i], i);
        	}
        }
        
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
        	ret[i] = map.get(A[i]);
        }
        return ret;
    }
}
