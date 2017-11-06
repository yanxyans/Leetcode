package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		int n = 8;
		int[][] image = new int[n][n];
		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				image[i][j] = k++;
			}
		}
		
		System.out.println("before");
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(image[i]));
		}
		
		RotateImage test = new RotateImage();
		test.rotate(image);
		
		System.out.println("after");
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(image[i]));
		}
	}
}
