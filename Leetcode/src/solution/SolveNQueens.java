package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveNQueens {
    public List<List<String>> solveNQueens(int n) {
    	List<List<String>> ret = new ArrayList<List<String>>();
    	if (n < 1) {
    		ret.add(new ArrayList<String>());
    		return ret;
    	}
    	
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
    			List<String> sol = new ArrayList<String>();
    			char[] tmp = new char[n];
    			Arrays.fill(tmp, '.');
    			
    			for (int i = 0; i < n; i++) {
    				tmp[queens[i]] = 'Q';
    				sol.add(new String(tmp));
    				tmp[queens[i]] = '.';
    			}
    			ret.add(sol);
    			
    			// continue looking for other solutions
    			row--;
    		}
    		
    		// backtrack to last placement
    		queens[row--] = -1;
    	}
    	
    	return ret;
    }
}
