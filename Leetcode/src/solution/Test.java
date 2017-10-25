package solution;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		CanJump test = new CanJump();
		int[] input = new int[8000];
		Arrays.fill(input, 1);
		
		long startTime = System.nanoTime();
		System.out.println(test.canJump(input));
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		System.out.println(duration / 1000000);
	}
}
