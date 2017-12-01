package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
	public List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> count = new HashMap<String, Integer>();
		for (String word : words) {
			count.put(word, count.getOrDefault(word, 0) + 1);
		}
		
		PriorityQueue<String> pq = new PriorityQueue<String>(
				(w1, w2) -> count.get(w1) != count.get(w2) ?
				count.get(w1) - count.get(w2) : w2.compareTo(w1));
		
		for (String word : count.keySet()) {
			pq.offer(word);
			if (pq.size() > k) pq.poll();
		}
		
		List<String> ret = new ArrayList<String>();
		while (!pq.isEmpty()) {
			ret.add(pq.poll());
		}
		Collections.reverse(ret);
		return ret;
	}
}
