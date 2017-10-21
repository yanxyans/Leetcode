package solution;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpiralOrderTwo test = new SpiralOrderTwo();
		int[][] ret = test.generateMatrix(4);
		for (int i = 0; i < ret.length; i++) {
			System.out.println(Arrays.toString(ret[i]));
		}
	}
}
