package solution;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;
        while (lo < hi) {
        	int mid = (lo + hi) / 2;
        	int val = nums[mid];
        	if (val == target) {
        		return mid;
        	} else if (val > target) {
        		hi = mid;
        	} else {
        		lo = mid + 1;
        	}
        }
        return lo;
    }
}
