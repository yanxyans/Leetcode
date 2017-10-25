package solution;

public class CanJump {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n < 1) {
            return false;
        }
        
        int jumpDestination = n - 1;
        for (int i = n - 2; i > -1; i--) {
            if (i + nums[i] >= jumpDestination) {
                jumpDestination = i;
            }
        }
        return jumpDestination == 0;
    }
}
