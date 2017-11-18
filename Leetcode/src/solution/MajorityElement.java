package solution;

public class MajorityElement {
    public int majorityElement(int[] nums) {
    	int ret = -1;
    	int cnt = 0;
    	for (int i = 0; i < nums.length; i++) {
    		int val = nums[i];
    		if (cnt == 0) ret = val;
    		if (ret == val) cnt++;
    		else cnt--;
    	}
    	return ret;
    }
}
