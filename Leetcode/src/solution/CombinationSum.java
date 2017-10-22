package solution;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	int n = candidates.length;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (n < 1) {
        	return ret;
        }
        
        List<Integer> nodes = new ArrayList<Integer>();
        nodes.add(0);
        
        int sum = candidates[0];
        int last = 0;
        
        while (last > -1) {
        	if (sum < target) {
        		int index = nodes.get(last);
        		nodes.add(index);
        		
        		int val = candidates[index];
        		sum += val;
        		
        		last++;
        	} else {
        		if (sum == target) {
        			// found combination
        			List<Integer> combn = new ArrayList<Integer>();
        			for (int index : nodes) {
        				int val = candidates[index];
        				combn.add(val);
        			}
        			ret.add(combn);
        		}
        		
        		do {
        			int index = nodes.get(last);
        			sum -= candidates[index];
        			
        			if (index < n - 1) {
        				nodes.set(last, index + 1);
        				sum += candidates[index + 1];
        				break;
        			} else {
        				nodes.remove(last--);
        			}
        		} while (last > -1);
        	}
        }
        
        return ret;
    }
}
