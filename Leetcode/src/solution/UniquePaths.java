package solution;

import java.util.Arrays;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
		int outer = Math.max(m, n);
		int inner = Math.min(m, n);
		int[] path = new int[inner];
		Arrays.fill(path, 1);
		
		for (int i = 1; i < outer; i++) {
			for (int j = 1; j < inner; j++) {
				path[j] += path[j - 1];
			}
		}
		return path[inner - 1];
	}
}
