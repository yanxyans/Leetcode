package solution;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n < 2) {
        	return;
        }
        
        int i = n - 1;
        while (i > 0 && nums[i] <= nums[i - 1]) {
        	i--;
        }
        
        if (i > 0) {
        	// swap is possible, get next number
        	int j = n - 1;
        	while (nums[j] <= nums[i - 1]) {
        		j--;
        	}
        	
        	swap(nums, i - 1, j);
        }
        
        int k = n - 1;
        while (i < k) {
        	swap(nums, i++, k--);
        }
    }
    
    private void swap(int[] nums, int i, int j) {
    	nums[i] ^= nums[j];
    	nums[j] ^= nums[i];
    	nums[i] ^= nums[j];
    }
}
