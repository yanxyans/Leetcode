package solution;

import java.util.Arrays;

public class ThreeSumClosest {
	/*
	Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
    For example, given array S = {-1 2 1 -4}, and target = 1.
    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
    */
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		
		int n = nums.length;
		int threeSum = nums[0] + nums[1] + nums[2];
		
		int i = 0;
		while (i < n - 2) {
			int j = i + 1;
			int k = n - 1;
			
			while (j < k) {
				int aSum = nums[i] + nums[j] + nums[k];
				if (aSum == target) {
					return aSum;
				} else if (aSum > target) {
					while (j < k && nums[k] == nums[--k]);
				} else {
					while (j < k && nums[j] == nums[++j]);
				}
				
				int aSumDiff = Math.abs(target - aSum);
				int tSumDiff = Math.abs(target - threeSum);
				if (aSumDiff < tSumDiff) {
					threeSum = aSum;
				}
			}
			
			while (i < n - 2 && nums[i] == nums[++i]);
		}
		
		return threeSum;
	}
}
