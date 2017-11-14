package solution;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
    	int m = grid.length;
    	if (m < 1) {
    		return -1;
    	}
    	
    	int n = grid[0].length;
    	for (int i = 0; i < m; i++) {
    		for (int j = 0; j < n; j++) {
    			if (i == 0 && j == 0) {
    				// top-left element
    			} else if (i == 0) {
    				// top element
    				grid[i][j] += grid[i][j - 1];
    			} else if (j == 0) {
    				// left element
    				grid[i][j] += grid[i - 1][j];
    			} else {
    				// take min path
    				grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
    			}
    		}
    	}
    	
    	return grid[m - 1][n - 1];
    }
}
