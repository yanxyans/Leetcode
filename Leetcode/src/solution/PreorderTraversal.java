package solution;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        
        if (root == null) {
        	return ret;
        }
        
        List<TreeNode> stack = new ArrayList<TreeNode>();
        stack.add(root);
        
        while (!stack.isEmpty()) {
        	TreeNode node = stack.remove(stack.size() - 1);
        	
        	ret.add(node.val);
        	if (node.right != null) {
        		stack.add(node.right);
        	}
        	if (node.left != null) {
        		stack.add(node.left);
        	}
        }
        
        return ret;
    }
}
