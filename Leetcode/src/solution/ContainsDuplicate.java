package solution;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	int num = nums[i];
        	if (seen.contains(num)) {
        		return true;
        	}
        	seen.add(num);
        }
        return false;
    }
}
