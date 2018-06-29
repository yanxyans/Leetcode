package solution;

public class CustomLinkedList {
	private ListNode head;
	private ListNode tail;
	
	public CustomLinkedList() {
		head = null;
		tail = null;
	}
	
	public void add(int key, int val) {
		ListNode node = new ListNode(key, val);
		if (head == null) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
	}
	
	public ListNode remove() {
		if (head == null) {
			return null;
		} else {
			ListNode ret = head;
			head = head.next;
			return ret;
		}
	}
	
	public ListNode remove(int key) {
		ListNode prev = new ListNode(0, 0);
		prev.next = head;
		while (prev.next != null && prev.next.key != key) {
			prev = prev.next;
		}
		if (prev.next != null) {
			ListNode ret = prev.next;
			prev.next = prev.next.next;
			return ret;
		} else {
			return null;
		}
	}
	
	public ListNode get(int key) {
		ListNode node = head;
		while (node != null && node.key != key) {
			node = node.next;
		}
		return node;
	}
	
	public Integer set(int key, int val) {
		ListNode node = head;
		while (node != null && node.key != key) {
			node = node.next;
		}
		if (node == null) {
			return null;
		}
		int ret = node.val;
		node.val = val;
		return ret;
	}
}
