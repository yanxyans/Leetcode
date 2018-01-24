package solution;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> code = new ArrayList<Integer>();
        code.add(0);
        if (n == 0) {
        	return code;
        }
        
        code.add(1);
        if (n == 1) {
        	return code;
        }
        
        code.add(3);
        code.add(2);
        
        int j = 2;
        for (int i = 2; i < n; i++) {
        	int p = code.size();
        	
        	for (int k = p; k > p - j; k--) {
        		code.add((1 << i) | code.get(k - 1));
        	}
        	for (int k = p; k < p + j; k++) {
        		code.add(((1 << (i - 1)) | (1 << (i - 2))) ^ code.get(k));
        	}
        	
        	j *= 2;
        }
        
        return code;
    }
}
