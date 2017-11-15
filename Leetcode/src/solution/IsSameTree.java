package solution;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return false;
        else if (p.val != q.val) return false;
        
        return ((p.left == null && q.left == null) ||
        		isSameTree(p.left, q.left)) &&
        	   ((p.right == null && q.right == null) ||
        	    isSameTree(p.right, q.right));
    }
}
