package solution;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
    	if (root == null) return true;
    	else if (!isSymmetricHelp(root.left, root.right)) return false;
    	
    	if (root.left == null) return true;
    	
    	List<TreeNode> left = new ArrayList<TreeNode>();
    	List<TreeNode> right = new ArrayList<TreeNode>();
    	left.add(root.left);
    	right.add(root.right);
    	
    	int size = 1;
    	while (size > 0) {
    		TreeNode lnode = left.remove(--size);
    		TreeNode rnode = right.remove(size);
    		if (!isSymmetricHelp(lnode.left, rnode.right)) return false;
    		else if (!isSymmetricHelp(lnode.right, rnode.left)) return false;
    		
    		if (lnode.left != null) {
    			left.add(lnode.left);
    			right.add(rnode.right);
    			size++;
    		}
    		if (lnode.right != null) {
    			left.add(lnode.right);
    			right.add(rnode.left);
    			size++;
    		}
    	}
    	return true;
    }
    
    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        
        return left.val == right.val;
    }
}
