package solution;

import java.util.ArrayList;
import java.util.List;

public class PrintPathSums {
	public List<Result> printPathSums(TreeNode root, int target) {
		List<Result> paths = new ArrayList<Result>();
		if (root == null) return paths;
		
		paths.addAll(printPathSums(root.left, target));
		paths.addAll(printPathSums(root.right, target));
		for (Result path : paths) path.add(root.val);
		
		Result newPath = new Result(target);
		newPath.add(root.val);
		paths.add(newPath);
		
		return paths;
	}
}
