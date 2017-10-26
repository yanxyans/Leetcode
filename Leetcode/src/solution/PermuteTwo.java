package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteTwo {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	Arrays.sort(nums);
        return permuteHelp(nums, 0, nums.length);
    }
    
    public List<List<Integer>> permuteHelp(int[] nums, int start, int end) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	
    	if (start >= end) {
    		ret.add(new ArrayList<Integer>());
    		return ret;
    	}
    	
    	int val = nums[start];
    	
    	for (int i = start; i < end; i++) {
    		if (i > start) {
    			if (nums[i] == nums[start]) {
    				continue;
    			}
    			
    			swap(nums, i, start);
    		}
    		
    		// get permutes of nums[start + 1, ..., end - 1]
    		List<List<Integer>> subPermutes = permuteHelp(nums, start + 1, end);
    		for (List<Integer> p : subPermutes) {
    			p.add(nums[start]);
    		}
    		ret.addAll(subPermutes);
    	}
    	
    	if (nums[start] != val) {
    		// shift values left
    		int tmp = nums[start];
    		for (int i = start; i < end - 1; i++) {
    			nums[i] = nums[i + 1];
    		}
    		nums[end - 1] = tmp;
    	}
    	return ret;
    }
    
    private void swap(int[] nums, int a, int b) {
    	nums[a] ^= nums[b];
    	nums[b] ^= nums[a];
    	nums[a] ^= nums[b];
    }
}
