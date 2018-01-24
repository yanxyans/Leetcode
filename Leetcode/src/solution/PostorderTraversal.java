package solution;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        
        if (root == null) {
            return ret;
        }
        
        List<TreeNode> stack = new ArrayList<TreeNode>();
        stack.add(root);
        
        while (!stack.isEmpty()) {
            int top = stack.size() - 1;
            TreeNode node = stack.get(top);
            
            if (node.left == null && node.right == null) {
                ret.add(stack.remove(top).val);
            } else {
                if (node.right != null) {
                    stack.add(node.right);
                    node.right = null;
                }
                if (node.left != null) {
                    stack.add(node.left);
                    node.left = null;
                }
            }
        }
        
        return ret;
    }
}
