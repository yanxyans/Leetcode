package solution;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < nums.length; i++) {
        	sumRight += nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
        	sumRight -= nums[i];
        	
        	if (sumLeft == sumRight) {
        		return i;
        	}
        	
        	sumLeft += nums[i];
        }
        
        return -1;
    }
}
