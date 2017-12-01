package solution;

public class UniquePathsTwo {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	if (m < 1) return -1;
    	int n = obstacleGrid[0].length;
    	if (n < 1) return -1;
    	
    	if (obstacleGrid[0][0] == 1) return 0;
    	obstacleGrid[0][0] = 1;
    	
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (i == 0 && j == 0)
        			continue;
        		else if (obstacleGrid[i][j] == 1)
        			obstacleGrid[i][j] = 0;
        		else {
        			if (j != 0)
        				obstacleGrid[i][j] += obstacleGrid[i][j - 1];
        			if (i != 0)
        				obstacleGrid[i][j] += obstacleGrid[i - 1][j];
        		}
        	}
        }
        return obstacleGrid[m - 1][n - 1];
    }
}
