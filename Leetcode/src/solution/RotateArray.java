package solution;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		if (k == 0) return;
		
		int i = 0;
		int cnt = 0;
		while (cnt < n) {
			int j = i + k;
			int rot = nums[i];
			while (i != j) {
				int tmp = nums[j];
				nums[j] = rot;
				cnt++;
				rot = tmp;
				
				j = (j + k) % n;
			}
			nums[j] = rot;
			cnt++;
			
			i++;
		}
	}
}
