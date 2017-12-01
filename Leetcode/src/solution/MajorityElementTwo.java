package solution;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwo {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ret = new ArrayList<Integer>();
        
        int[] candidates = new int[2];
        int[] counts = new int[2];
        for (int i = 0; i < n; i++) {
        	int val = nums[i];
        	if (candidates[0] == val) {
        		counts[0]++;
        	} else if (candidates[1] == val) {
        		counts[1]++;
        	} else if (counts[0] == 0) {
        		candidates[0] = val;
        		counts[0] = 1;
        	} else if (counts[1] == 0) {
        		candidates[1] = val;
        		counts[1] = 1;
        	} else {
        		counts[0]--;
        		counts[1]--;
        	}
        }
        
        int[] freq = new int[2];
        for (int i = 0; i < n; i++) {
        	int val = nums[i];
        	if (counts[0] > 0 && candidates[0] == val) freq[0]++;
        	else if (counts[1] > 0 && candidates[1] == val) freq[1]++;
        }
        for (int i = 0; i < 2; i++) {
        	if (freq[i] > n / 3) ret.add(candidates[i]);
        }
        return ret;
    }
}
