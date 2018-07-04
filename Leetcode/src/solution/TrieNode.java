package solution;

public class TrieNode {
	TrieNode[] children;
	int val;
	boolean isNum;
	long num;
	public TrieNode(int val, int child) {
		children = new TrieNode[child];
		this.val = val;
		isNum = false;
	}
}
