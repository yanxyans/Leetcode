package solution;

import java.util.Arrays;

public class SolveNQueensTwo {
    public int totalNQueens(int n) {
    	if (n < 1) {
    		return 1;
    	}
    	
    	int ret = 0;
    	int[] queens = new int[n];
    	Arrays.fill(queens, -1);
    	
    	int row = 0;
    	while (row > -1) {
    		if (row < n) {
    			int col = queens[row] + 1;
    			while (col < n) {
    				int i = 0;
    				while (i < row) {
    					int queen = queens[i];
    					
    					if (queen == col) {
    						// found queen occupying same column
    						col++;
    						break;
    					}
    					
    					int deltaY = queen - col;
    					int deltaX = i - row;
    					if (deltaY == -deltaX || deltaY == deltaX) {
    						// found queen occupying same diagonal
    						col++;
    						break;
    					}
    					
    					// look at all possible overlaps
    					i++;
    				}
    				
    				if (i == row) {
    					// found valid placement
    					break;
    				}
    			}
    			
    			if (col < n) {
    				// can place queen
    				queens[row++] = col;
    				continue;
    			}
    		} else if (row == n) {
    			// found a solution
    			ret++;
    			
    			// continue looking for other solutions
    			row--;
    		}
    		
    		// backtrack to last placement
    		queens[row--] = -1;
    	}
    	
    	return ret;
    }
}
