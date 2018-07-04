package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrderPhoneBook {
	public long[] orderNums(long[] nums) {
		Long[] nums2 = new Long[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}
		Arrays.sort(nums2, new Comparator<Long>() {
			public int compare(Long a, Long b) {
				String c = Long.toString(a);
				String d = Long.toString(b);
				if (c.charAt(0) < d.charAt(0)) {
					return -1;
				} else if (c.charAt(0) > d.charAt(0)) {
					return 1;
				} else {
					String e = c.substring(1);
					String f = d.substring(1);
					if (e.length() == 0) {
						return -1;
					} else if (f.length() == 0) {
						return 1;
					}
					return compare(Long.parseLong(e), Long.parseLong(f));
				}
			}
		});
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums2[i];
		}
		return nums;
	}
	
	public long[] orderPhoneBook2(long[] nums) {
		int n = nums.length;
		TrieNode root = new TrieNode(0, 10);
		for (int i = 0; i < n; i++) {
			String num = Long.toString(nums[i]);
			int m = num.length();
			TrieNode node = root;
			for (int j = 0; j < m; j++) {
				char c = num.charAt(j);
				int k = c - '0';
				if (node.children[k] == null) {
					node.children[k] = new TrieNode(c - '0', 10);
				}
				node = node.children[k];
			}
			node.isNum = true;
			node.num = nums[i];
		}
		
		long[] ret = new long[n];
		dfs(ret, root, 0);
		
		return ret;
	}
	
	private int dfs(long[] ret, TrieNode root, int index) {
		if (root == null) {
			return index;
		}
		
		if (root.isNum) {
			ret[index++] = root.num;
		}
		
		int newIndex = index;
		for (int i = 0; i < 10; i++) {
			newIndex = dfs(ret, root.children[i], newIndex);
		}
		
		return newIndex;
	}
}

