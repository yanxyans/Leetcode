package solution;

public class RotatedSearchTwo {
    public boolean search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        
        while (lo <= hi) {
        	int mid = (lo + hi) / 2;
        	int val = nums[mid];
        	if (val == target) {
        		return true;
        	} else if (val > target) {
        		int hVal = nums[hi];
        		if (hVal == target) {
        			return true;
        		} else if (hVal > target) {
        			lo = mid + 1;
        			hi = hi - 1;
        		} else {
        			hi = mid - 1;
        		}
        	} else {
        		int lVal = nums[lo];
        		if (lVal == target) {
        			return true;
        		} else if (lVal < target) {
        			lo = lo + 1;
        			hi = mid - 1;
        		} else {
        			lo = mid + 1;
        		}
        	}
        }
        
        return false;
    }
}
