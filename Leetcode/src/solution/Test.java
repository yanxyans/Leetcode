package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		MajorityElementTwo test = new MajorityElementTwo();
		int[] nums = new int[] {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3};
		List<Integer> ret = test.majorityElement(nums);
		System.out.println(ret);
	}

}
