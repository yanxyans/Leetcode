package solution;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<Integer>(rowIndex + 1);
        
        long elem = 1;
        for (int i = 0; i < rowIndex + 1; i++) {
        	ret.add((int) elem);
        	elem = elem * (rowIndex - i) / (i + 1);
        }
        
        return ret;
    }
}
