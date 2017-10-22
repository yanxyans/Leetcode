package solution;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		CombinationSumTwo test = new CombinationSumTwo();
		List<List<Integer>> res = test.combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8);
		
		System.out.println(res.size());
		for (List<Integer> r : res) {
			System.out.println(Arrays.asList(r));
		}
		
	}
}
