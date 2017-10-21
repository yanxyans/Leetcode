package solution;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int bot = matrix.length;
        if (bot < 1) {
            return new ArrayList<Integer>();
        }
        
        int right = matrix[0].length;
        
        int top = 0;
        int left = 0;
        
        // 0 left -> right
        // 1 top -> bot
        // 2 right -> left
        // 3 bot -> top
        int dir = 0;
        List<Integer> spiral = new ArrayList<Integer>();
        while (top < bot && left < right) {
        	if (dir == 0) {
        		for (int i = left; i < right; i++) {
        			spiral.add(matrix[top][i]);
        		}
        		top++;
        	} else if (dir == 1) {
        		for (int j = top; j < bot; j++) {
        			spiral.add(matrix[j][right - 1]);
        		}
        		right--;
        	} else if (dir == 2) {
        		for (int k = right - 1; k > left - 1; k--) {
        			spiral.add(matrix[bot - 1][k]);
        		}
        		bot--;
        	} else if (dir == 3) {
        		for (int l = bot - 1; l > top - 1; l--) {
        			spiral.add(matrix[l][left]);
        		}
        		left++;
        	}
        	dir = (dir + 1) % 4;
        }
        return spiral;
    }
}
