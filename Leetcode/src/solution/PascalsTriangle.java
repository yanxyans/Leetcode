package solution;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (numRows < 1) {
            return ret;
        }
        
        List<Integer> one = new ArrayList<Integer>();
        one.add(1);
        ret.add(one);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> lastRow = ret.get(i - 1);
            
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            row.add(1);
            
            ret.add(row);
        }
        
        return ret;
    }
}
