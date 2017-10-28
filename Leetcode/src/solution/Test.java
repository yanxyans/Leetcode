package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		SolveNQueens test = new SolveNQueens();
		List<List<String>> ret = test.solveNQueens(4);
		System.out.println(ret.size());
	}
}
