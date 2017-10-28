package solution;

import java.util.ArrayList;
import java.util.List;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        stack.add(root);
        
        int size = 1;
        while (size > 0) {
        	TreeNode node = stack.remove(size - 1);
        	
        	if (node != null) {
        		TreeNode tmp = node.left;
        		node.left = node.right;
        		node.right = tmp;
        		
        		stack.add(node.left);
        		stack.add(node.right);
        		
        		size++;
        	} else {
        		size--;
        	}
        }
        
        return root;
    }
}
