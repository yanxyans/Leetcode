package solution;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
    public int climbStairs(int n) {
    	Map<Integer, Integer> seen = new HashMap<Integer, Integer>();
    	seen.put(1, 1);
    	seen.put(2, 2);
        
        return climbStairs(n, seen);
    }
    
    private int climbStairs(int n, Map<Integer, Integer> seen) {
    	if (seen.containsKey(n)) {
    		return seen.get(n);
    	}
        
    	int climbOne = climbStairs(n - 1, seen);
    	seen.put(n - 1, climbOne);
    	
    	int climbTwo = climbStairs(n - 2, seen);
    	seen.put(n - 2, climbTwo);
        return climbOne + climbTwo;
    }
}
