package solution;

public class SpiralOrderTwo {
    public int[][] generateMatrix(int n) {
    	int[][] matrix = new int[n][n];
    	
    	int top = 0;
    	int bot = n;
    	int left = 0;
    	int right = n;
    	
    	int dir = 0;
    	int cnt = 1;
    	while (top < bot && left < right) {
    		if (dir == 0) {
    			for (int i = left; i < right; i++) {
    				matrix[top][i] = cnt++;
    			}
    			top++;
    		} else if (dir == 1) {
    			for (int j = top; j < bot; j++) {
    				matrix[j][right - 1] = cnt++;
    			}
    			right--;
    		} else if (dir == 2) {
    			for (int k = right - 1; k > left - 1; k--) {
    				matrix[bot - 1][k] = cnt++;
    			}
    			bot--;
    		} else if (dir == 3) {
    			for (int l = bot - 1; l > top - 1; l--) {
    				matrix[l][left] = cnt++;
    			}
    			left++;
    		}
    		dir = (dir + 1) % 4;
    	}
    	return matrix;
    }
}
