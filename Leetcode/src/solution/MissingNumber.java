package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
	public int missingNumber(Integer[] arr) {
		ArrayList<Integer> tmp = new ArrayList<Integer>(Arrays.asList(arr));
		return missingNumber(tmp, 0);
	}
	
	public int missingNumber(ArrayList<Integer> arr, int b) {
		if (b >= 31) return 0;
		
		ArrayList<Integer> ones = new ArrayList<Integer>(), zeros = new ArrayList<Integer>();
		for (int i : arr) {
			if ((i & (1 << b)) == 0) {
				zeros.add(i);
			} else {
				ones.add(i);
			}
		}
		
		if (ones.size() >= zeros.size()) {
			int v = missingNumber(zeros, b + 1);
			return (v << 1) | 0;
		} else {
			int v = missingNumber(ones, b + 1);
			return (v << 1) | 1;
		}
	}
}
