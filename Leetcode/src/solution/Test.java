package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		ThreeSum threeSum = new ThreeSum();
		int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
		test(threeSum, nums);
		int[] nums1 = new int[] {-1, -1, 0, 0, 1, 1, -2, 2};
		test(threeSum, nums1);
		int[] nums2 = new int[] {-2, -2, -1, 0, 0, 1, 2, 2, 3, 4};
		test(threeSum, nums2);
	}

	public static void test(ThreeSum threeSum, int[] nums) {
		System.out.println("test for: " + Arrays.toString(nums));
		List<List<Integer>> ret = threeSum.threeSum(nums);
		HashSet<String> uniq = new HashSet<String>();
		for (List<Integer> r : ret) {
			Collections.sort(r);
			System.out.println(r.toString());
			uniq.add(r.toString());
		}
		System.out.println("total elements: " + ret.size() + ", unique elements: " + uniq.size());
	}
}
