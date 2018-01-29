package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> dups = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	int cur = nums[i];
        	
        	while (cur != i + 1) {
        		int pivot = nums[cur - 1];
        		if (pivot == cur) {
        			dups.add(cur);
        			break;
        		}
        		
        		nums[cur - 1] ^= nums[i];
        		nums[i] ^= nums[cur - 1];
        		nums[cur - 1] ^= nums[i];
        		
        		cur = pivot;
        	}
        }
        
        return new ArrayList<Integer>(dups);
    }
}
