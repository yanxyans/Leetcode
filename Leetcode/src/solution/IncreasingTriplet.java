package solution;

public class IncreasingTriplet {
	public boolean increasingTriplet(int[] nums) {
		int n = nums.length;
		if (n < 3) return false;
		
		for (int i = 0; i < n - 2; i++) {
			if (nums[i] < nums[i + 1]) {
				if (nums[i + 1] < nums[i + 2]) {
					return true;
				}
				i++;
			}
		}
		
		return false;
	}
}
