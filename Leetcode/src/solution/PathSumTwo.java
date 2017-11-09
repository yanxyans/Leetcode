package solution;

import java.util.ArrayList;
import java.util.List;

public class PathSumTwo {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
        	return ret;
        }
        
        List<TreeNode> stack = new ArrayList<TreeNode>();
        sum -= root.val;
        stack.add(root);
        
        TreeNode dummy = new TreeNode(0);
        
        while (!stack.isEmpty()) {
        	int n = stack.size();
        	TreeNode node = stack.get(n - 1);
        	
        	if (node.left == null && node.right == null) {
        		if (sum == 0) {
	        		List<Integer> path = new ArrayList<Integer>();
	        		for (int i = 0; i < n; i++) {
	        			TreeNode e = stack.get(i);
	        			path.add(e.val);
	        		}
	        		ret.add(path);
        		}
        		
        		sum += stack.remove(n - 1).val;
        	} else if (node.left != null && node.left != dummy) {
        		TreeNode leftChild = node.left;
        		node.left = dummy;
        		
        		sum -= leftChild.val;
        		stack.add(leftChild);
        	} else if (node.right != null && node.right != dummy) {
        		TreeNode rightChild = node.right;
        		node.right = dummy;
        		
        		sum -= rightChild.val;
        		stack.add(rightChild);
        	} else {
        		sum += stack.remove(n - 1).val;
        	}
        	
        }
        
        return ret;
    }
}
