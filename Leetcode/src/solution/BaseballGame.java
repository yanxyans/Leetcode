package solution;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public int calPoints(String[] ops) {
        List<Integer> stack = new ArrayList<Integer>();
        int size = 0;
        int sum = 0;
        
        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];
            if (op.equals("+")) {
                if (size < 2) {
                    return -1;
                }
                int add = stack.get(size - 2) + stack.get(size++ - 1);
                stack.add(add);
                sum += add;
            } else if (op.equals("D")) {
                if (size < 1) {
                    return -1;
                }
                int mul = stack.get(size++ - 1) * 2;
                stack.add(mul);
                sum += mul;
            } else if (op.equals("C")) {
                if (size < 1) {
                    return -1;
                }
                sum -= stack.remove(--size);
            } else {
            	int val = Integer.parseInt(op);
                stack.add(val);
                size++;
                sum += val;
            }
        }
        
        return sum;
    }
}
