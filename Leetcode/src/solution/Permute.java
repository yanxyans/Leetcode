package solution;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        return permuteHelp(nums, 0, nums.length);
    }
    
    private List<List<Integer>> permuteHelp(int[] nums, int start, int end) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	
    	if (start >= end) {
    		ret.add(new ArrayList<Integer>());
    		return ret;
    	}
    	
    	for (int i = start; i < end; i++) {
    		if (i != start) {
	    		nums[start] ^= nums[i];
	    		nums[i] ^= nums[start];
	    		nums[start] ^= nums[i];
    		}
    		
    		// get permutes of nums[start + 1, ..., end - 1]
    		List<List<Integer>> children = permuteHelp(nums, start + 1, end);
    		
    		for (List<Integer> p : children) {
    			p.add(nums[start]);
    		}
    		ret.addAll(children);
    		
    		// restore ordering
    		if (i != start) {
	    		nums[start] ^= nums[i];
	    		nums[i] ^= nums[start];
	    		nums[start] ^= nums[i];
    		}
    	}
    	
    	return ret;
    }
}
