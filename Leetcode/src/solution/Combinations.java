package solution;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (k > n || k < 1) {
            return ret;
        }
        
        for (int i = 1; i <= n - k + 1; i++) {
            List<Integer> base = new ArrayList<Integer>();
            base.add(i);
            ret.add(base);
        }
        
        for (int i = 1; i < k; i++) {
            int retSize = ret.size();
            for (int j = retSize - 1; j >= 0; j--) {
                List<Integer> base = ret.remove(j);
                int baseSize = base.size();
                int digit = base.get(baseSize - 1);
                for (int l = digit + 1; l <= n - k + 1 + i; l++) {
                    List<Integer> newBase = new ArrayList<Integer>();
                    newBase.addAll(base);
                    newBase.add(l);
                    ret.add(newBase);
                }
            }
            
        }
        
        return ret;
    }
}
