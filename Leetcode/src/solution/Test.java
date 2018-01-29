package solution;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		FindDuplicates findDuplicates = new FindDuplicates();
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
		List<Integer> dups = findDuplicates.findDuplicates(nums);
		System.out.println(dups);
	}

}
