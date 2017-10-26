package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		PermuteTwo test = new PermuteTwo();
		int[] input = new int[] {-1,2,0,-1,1,0,1};
		
		long startTime = System.nanoTime();
		List<List<Integer>> res = test.permuteUnique(input);
		long endTime = System.nanoTime();
		
		Set<String> seen = new HashSet<String>();

		for (List<Integer> ret : res) {
			StringBuilder sb = new StringBuilder();
			for (int i : ret) {
				sb.append('#');
				sb.append(i);
			}
			
			String key = sb.toString();
			if (seen.contains(key)) {
				System.out.print("seen already: ");
			} else {
				seen.add(key);
			}
			
			System.out.println(ret);
		}
		
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		double seconds = (double) duration / 1000000000.0;
		System.out.println(seconds);
	}
}
