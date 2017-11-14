package solution;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
    	int ret = nums[0];
    	
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            ret = Math.max(ret, nums[i]);
        }
        return ret;
    }
}
