package solution;

public class SearchMatrixTwo {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows < 1) {
            return false;
        }
        
        int cols = matrix[0].length;
        
        int row = 0;
        int col = cols - 1;
        while (row < rows && col > -1) {
            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (val > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
