package solution;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        List<TreeNode> queue = new ArrayList<TreeNode>();
        if (root != null) {
        	queue.add(root);
        }
        
        while (!queue.isEmpty()) {
        	int queueSize = queue.size();
        	List<Integer> level = new ArrayList<Integer>();
        	while (queueSize-- > 0) {
        		TreeNode node = queue.remove(0);
        		level.add(node.val);
        		
        		if (node.left != null) {
        			queue.add(node.left);
        		}
        		if (node.right != null) {
        			queue.add(node.right);
        		}
        	}
        	
        	ret.add(level);
        }
        
        return ret;
    }
}
