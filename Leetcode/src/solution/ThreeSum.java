package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> trip = new ArrayList<List<Integer>>();
        HashSet<Integer> seen = new HashSet<Integer>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
        	int target = nums[i];
        	for (int j = i + 1; j < nums.length; j++) {
        		if (seen.contains(-target -nums[j])) {
        			trip.add(Arrays.asList(target, nums[j], -target -nums[j]));
                    while (j < nums.length - 1 && nums[j] == nums[j + 1]) j++;
                    while (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
        		}
        		seen.add(nums[j]);
        		
        	}
        	seen.clear();
        	
        }
        
        return trip;
    }
}
