package solution;

public class CustomHashMap {
	private CustomLinkedList[] map;
	private double loadFactor;
	private int size;
	
	public CustomHashMap() {
		map = new CustomLinkedList[10];
		for (int i = 0; i < 10; i++) {
			map[i] = new CustomLinkedList();
		}
		loadFactor = 0.70;
		size = 0;
	}
	
	public Integer put(int key, int val) {
		int index = key % map.length;
		Integer ret = map[index].set(key, val);
		if (ret == null) {
			size++;
			
			int n = map.length;
			if (size > n * loadFactor) {
				// resize before adding
				CustomLinkedList[] oldMap = map;
				map = new CustomLinkedList[n * 2];
				for (int i = 0; i < n * 2; i++) {
					map[i] = new CustomLinkedList();
				}
				size = 0;
				for (int i = 0; i < oldMap.length; i++) {
					ListNode node = oldMap[i].remove();
					while (node != null) {
						put(node.key, node.val);
						node = oldMap[i].remove();
					}
				}
				put(key, val);
			} else {
				// just add to hash map
				map[index].add(key, val);
			}
		}
		return ret;
	}
	
	public Integer remove(int key) {
		int index = key % map.length;
		ListNode ret = map[index].remove(key);
		if (ret != null) size--;
		return ret == null ? null : ret.val;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Integer get(int key) {
		int index = key % map.length;
		ListNode ret = map[index].get(key);
		return ret == null ? null : ret.val;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < map.length; i++) {
			s.append("index " + i + ": ");
			s.append(map[i].toString());
			s.append(System.lineSeparator());
		}
		return s.toString();
	}
}
