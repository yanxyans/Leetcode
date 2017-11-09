package solution;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> ret = new ArrayList<Integer>();
    	if (root == null) {
    		return ret;
    	}
    	
    	List<TreeNode> stack = new ArrayList<TreeNode>();
    	while (root != null) {
    		stack.add(root);
    		root = root.left;
    	}
    	
    	while (!stack.isEmpty()) {
    		TreeNode node = stack.remove(stack.size() - 1);
    		ret.add(node.val);
    		
    		TreeNode right = node.right;
    		while (right != null) {
    			stack.add(right);
    			right = right.left;
    		}
    	}
    	
    	return ret;
    }
}
