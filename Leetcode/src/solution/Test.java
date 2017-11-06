package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		FindMedianSortedArrays test = new FindMedianSortedArrays();
		double ret = test.findMedianSortedArrays(new int[] {1,3}, new int[] {2});
		System.out.println(ret);
		
		// 1 2 3 4 4 5 5 6 6 7 7 8 9
	}
}
