package solution;

import java.util.*;

public class AppleStand {
	private int time;
	private TreeMap<Integer, Integer> apples = new TreeMap<Integer, Integer>();
	
	public int buyApples(int now, int expiry, int volume) {
		time = now;
		apples.put(expiry, apples.getOrDefault(expiry, 0) + volume);
		
		Integer k = apples.firstKey();
		while (k != null && k <= time) {
			apples.remove(k);
			k = apples.firstKey();
		}
		int cnt = 0;
		Iterator<Integer> it = apples.values().iterator();
		while (it.hasNext()) {
			cnt += (int)it.next();
		}
		return cnt;
	}
	
	public int sellApples(int now, int volume) {
		time = now;
		Integer k = apples.firstKey();
		while (k != null && k < time) {
			apples.remove(k);
			k = apples.firstKey();
		}
		while (k != null && apples.get(k) <= volume) {
			int val = apples.remove(k);
			volume -= val;
			k = apples.firstKey();
		}
		if (volume > 0) {
			int val = apples.get(k);
			apples.put(k, val - volume);
			volume = 0;
		}
		int cnt = 0;
		Iterator<Integer> it = apples.values().iterator();
		while (it.hasNext()) {
			cnt += (int)it.next();
		}
		return cnt;
	}
}
