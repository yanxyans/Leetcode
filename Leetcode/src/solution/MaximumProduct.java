package solution;

public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        int[] max = new int[] {nums[0], nums[1], nums[2]};
        int[] min = new int[] {nums[0], nums[1]};
        
        int minIndex = minimumIndex(max);
        int maxIndex = maximumIndex(min);
        
        if (nums[2] < min[maxIndex]) {
        	min[maxIndex] = nums[2];
        	maxIndex = maximumIndex(min);
        }
        
        for (int i = 3; i < nums.length; i++) {
        	if (nums[i] > max[minIndex]) {
        		max[minIndex] = nums[i];
        		minIndex = minimumIndex(max);
        	}
        	
        	if (nums[i] < min[maxIndex]) {
        		min[maxIndex] = nums[i];
        		maxIndex = maximumIndex(min);
        	}
        }
        
        return Math.max(max[0] * max[1] * max[2],
        				max[maximumIndex(max)] * min[0] * min[1]);
    }
    
    private int minimumIndex(int[] nums) {
    	int min = 0;
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i] < nums[min])
    			min = i;
    	}
    	return min;
    }
    
    private int maximumIndex(int[] nums) {
    	int max = 0;
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i] > nums[max])
    			max = i;
    	}
    	return max;
    }
}
