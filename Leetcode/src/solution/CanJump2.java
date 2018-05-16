package solution;

public class CanJump2 {
	public boolean canJump(int[] nums) {
		int jumpToEnd = 0;

		int n = nums.length;
		for (int i = n - 2; i >= 0; i--) {
			jumpToEnd++;
			if (nums[i] >= jumpToEnd) jumpToEnd = 0;
		}

		return jumpToEnd == 0;
	}
}
