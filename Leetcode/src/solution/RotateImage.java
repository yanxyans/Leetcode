package solution;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		if (n < 1) {
			return;
		}
		
		for (int start = 0; start < n / 2; start++) {
			int end = n - start - 1;
			int elem = end - start;
			for (int i = 0; i < elem; i++) {
				// top-left to bottom-left
				matrix[start][start + i] ^= matrix[end - i][start];
				matrix[end - i][start] ^= matrix[start][start + i];
				matrix[start][start + i] ^= matrix[end - i][start];
				
				// bottom-left to bottom-right
				matrix[end - i][start] ^= matrix[end][end - i];
				matrix[end][end - i] ^= matrix[end - i][start];
				matrix[end - i][start] ^= matrix[end][end - i];
				
				// bottom-right to top-right
				matrix[end][end - i] ^= matrix[start + i][end];
				matrix[start + i][end] ^= matrix[end][end - i];
				matrix[end][end - i] ^= matrix[start + i][end];
			}
		}
	}
}
