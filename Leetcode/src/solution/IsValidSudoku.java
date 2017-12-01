package solution;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        if (m < 0) {
        	return false;
        }
        
        int sqrt = (int) Math.sqrt(m);
        if (sqrt * sqrt != m) {
        	return false;
        }
        
        for (int i = 0; i < m; i++) {
        	if (board[i].length != m) {
        		return false;
        	}
        }
        
        int[] row;
        int[] col;
        for (int i = 0; i < m; i++) {
        	if (board[i].length != m) {
        		return false;
        	}
        	row = new int[m];
        	col = new int[m];
        	for (int j = 0; j < m; j++) {
        		char r = board[i][j];
        		char c = board[j][i];
        		if (r == '.') {
        			// do nothing
        		} else if (!(0 <= r - '1' && r - '1' < m)) {
        			return false;
        		} else if (row[r - '1'] == 1) {
        			return false;
        		} else {
        			row[r - '1'] = 1;
        		}
        		
        		if (c == '.') {
        			// do nothing
        		} else if (!(0 <= c - '1' && c - '1' < m)) {
        			return false;
        		} else if (col[c - '1'] == 1) {
        			return false;
        		} else {
        			col[c - '1'] = 1;
        		}
        	}
        }
        
        int[] sub;
        for (int i = 0; i < m; i++) {
        	sub = new int[m];
        	int k = (i / sqrt) * sqrt;
        	int l = (i * sqrt) % m;
        	for (int a = 0; a < sqrt; a++) {
        		for (int b = 0; b < sqrt; b++) {
        			char s = board[k + a][l + b];
        			if (s == '.') {
        				continue;
        			} else if (!(0 <= s - '1' && s - '1' < m)) {
        				System.out.println("new check sub");
        				return false;
        			} else if (sub[s - '1'] == 1) {
        				return false;
        			} else {
        				sub[s - '1'] = 1;
        			}
        		}
        	}
        }
        
        return true;
    }
}
