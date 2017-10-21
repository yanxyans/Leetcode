package solution;

public class RotatedSearch {

    public int search(int[] nums, int target) {
        // get start index
        int start = findMin(nums);
        
        // binary search with displacement
        int lo = 0;
        int n = nums.length;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = (lo  + hi) / 2;
            int delta = (mid + start) % n;
            int val = nums[delta];
            
            if (val == target) {
                return delta;
            } else if (val > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
    
	private int findMin(int[] nums) {
		int n = nums.length;
		int lo = 0;
		int hi = n - 1;
		
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] > nums[hi]) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		
		// lo == hi
		return lo;
	}

}
