package solution;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        while (-1 < row && col < matrix[0].length) {
        	if (matrix[row][col] == target) {
        		return true;
        	} else if (matrix[row][col] < target) {
        		col++;
        	} else {
        		row--;
        	}
        }
        
        return false;
    }
}
