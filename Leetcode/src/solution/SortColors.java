package solution;

public class SortColors {
	public void sortColors(int[] nums) {
		int insert = 0;
		insert = sortColor(nums, insert, 0);
		insert = sortColor(nums, insert, 1);
	}
	
	public int sortColor(int[] nums, int i, int color) {
		int n = nums.length;
		while (i < n && nums[i] == color) {
			i++;
		}
		for (int j = i + 1; j < n; j++) {
			if (nums[j] == color) {
				swap(nums, i++, j);
			}
		}
		return i;
	}
	
	public void swap(int[] nums, int i, int j) {
		nums[i] ^= nums[j];
		nums[j] ^= nums[i];
		nums[i] ^= nums[j];
	}
}
