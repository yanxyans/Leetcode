package solution;

public class IsHappy {
    public boolean isHappy(int n) {
    	int slow = next(n);
    	int fast = next(next(n));
    	
    	while (slow != fast) {
    		if (fast == 1) {
    			return true;
    		}
    		
    		slow = next(slow);
    		fast = next(next(fast));
    	}
    	return fast == 1;
    }
    
    private int next(int n) {
    	int ret = 0;
    	while (n > 0) {
    		int x = n % 10;
    		ret += x * x;
    		
    		n /= 10;
    	}
    	return ret;
    }
}
