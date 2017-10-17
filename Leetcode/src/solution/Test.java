package solution;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateParenthesis gp = new GenerateParenthesis();
		List<String> all = gp.generateParenthesis(5);
		
		StringBuilder sb = new StringBuilder();
		for (String s : all) {
			sb.append(s);
			sb.append("\t");
		}
		System.out.println(sb.toString());
		
		SwapPairs sp = new SwapPairs();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		
		sb.setLength(0);
		ListNode ret = a;
		while (ret != null) {
			sb.append(ret.val);
			sb.append("->");
			ret = ret.next;
		}
		System.out.println(sb.toString());
		
		ret = sp.swapPairs(a);
		sb.setLength(0);
		while (ret != null) {
			sb.append(ret.val);
			sb.append("->");
			ret = ret.next;
		}
		System.out.println(sb.toString());
	}

}
