package solution;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	Set<Integer> seen = new HashSet<Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		int val = nums[i];
    		if (i > k) {
    			seen.remove(nums[i - 1 - k]);
    		}
    		if (seen.contains(val)) {
    			return true;
    		}
    		seen.add(val);
    	}
        return false;
    }
}
