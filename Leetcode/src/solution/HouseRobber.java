package solution;

public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 1) {
            return 0;
        } else if (n < 2) {
            return nums[0];
        }
        
        nums[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            nums[i] = Math.max(nums[i] + nums[i - 2], nums[i - 1]);
        }
        return nums[n - 1];
    }
}
