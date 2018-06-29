package solution;

public class ListNode {
	public int key;
	public int val;
	public ListNode next;
	
	public ListNode(int key, int val) {
		this.key = key;
		this.val = val;
	}
	
	public ListNode(int val) {
		this(0, val);
	}
}
