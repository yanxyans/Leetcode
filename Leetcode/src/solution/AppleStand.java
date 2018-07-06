package solution;

import java.util.*;

public class AppleStand {
	private int time;
	private TreeMap<Integer, Integer> apples = new TreeMap<Integer, Integer>();
	
	public int buyApples(int now, int expiry, int volume) {
		time = now;
		apples.put(expiry, apples.getOrDefault(expiry, 0) + volume);
		
		Iterator<Map.Entry<Integer, Integer>> it = apples.entrySet().iterator();
		int cnt = 0;
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> next = it.next();
			if (next.getKey() <= time) {
				it.remove();
			} else {
				cnt += next.getValue();
			}
		}
		return cnt;
	}
	
	public int sellApples(int now, int volume) {
		time = now;
		
		Iterator<Map.Entry<Integer, Integer>> it = apples.entrySet().iterator();
		int cnt = 0;
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> next = it.next();
			if (next.getKey() < time) {
				it.remove();
			} else {
				if (volume > 0) {
					int numApples = next.getValue();
					if (numApples <= volume) {
						volume -= numApples;
						it.remove();
					} else {
						int diff = numApples - volume;
						apples.put(next.getKey(), diff);
						volume = 0;
						cnt += diff;
					}
				} else {
					cnt += next.getValue();
				}
			}
		}
		return cnt;
	}
}
