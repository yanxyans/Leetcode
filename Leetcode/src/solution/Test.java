package solution;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		QuickSort quickSort = new QuickSort();
		int[] data = new int[] {1, 3, 4, 5, 1, 2, 0, 5, 11, 3};
		
		System.out.println("before sort: " + Arrays.toString(data));
		quickSort.sort(data);
		System.out.println("after sort " + Arrays.toString(data));
	}

}
