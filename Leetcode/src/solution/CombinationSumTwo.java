package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = candidates.length;
        if (n < 1) {
            return ret;
        }
        
        Arrays.sort(candidates);
        List<Integer> comb = new ArrayList<Integer>();
        comb.add(0);
        
        int index = 0;
        int sum = candidates[0];
        
        int size = 0;
        while (size > -1) {
        	if (sum < target) {
        		if (index < n - 1) {
        			comb.add(++index);
        			sum += candidates[index];
        			size++;
        			continue;
        		}
        	} else if (sum == target) {
        		List<Integer> copy = new ArrayList<Integer>();
        		for (Integer i : comb) {
        			copy.add(candidates[i]);
        		}
        		ret.add(copy);
        	}
        	
        	comb.remove(size--);
        	sum -= candidates[index];
        	while (size > -1) {
        		index = comb.get(size);
        		sum -= candidates[index++];
        		while (index < n && candidates[index] == candidates[index - 1]) {
        			index++;
        		}
        		
        		if (index < n) {
        			comb.set(size, index);
        			sum += candidates[index];
        			break;
        		} else {
        			comb.remove(size--);
        		}
        	}
        }
        
        return ret;
    }
}
