package solution;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		MissingNumber missingNumber = new MissingNumber();
		Integer[] data = new Integer[] {1, 2, 3, 4};
		int ret = missingNumber.missingNumber(data);
		System.out.println(ret);
	}

}
