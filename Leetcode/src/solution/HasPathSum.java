package solution;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        int val = root.val;
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        return (val == sum && left == null && right == null) ||
            hasPathSum(left, sum - val) ||
            hasPathSum(right, sum - val);
    }
}
