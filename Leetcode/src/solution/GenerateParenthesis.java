package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {
	/*
	Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
	
	For example, given n = 3, a solution set is:
	
	[
	  "((()))",
	  "(()())",
	  "(())()",
	  "()(())",
	  "()()()"
	]
	 */
    public List<String> generateParenthesis(int n) {
        List<String> paren = new ArrayList<String>();
        Set<String> seen = new HashSet<String>();
        if (n < 1) {
        	return paren;
        }
        
        paren.add("()");
        for (int i = 1; i < n; i++) {
        	int p = paren.size();
        	for (int j = 0; j < p; j++) {
        		String parenOld = paren.remove(0);
        		int l = parenOld.length();
        		for (int k = 0; k < l + 1; k++) {
        			String parenNew = parenOld.substring(0, k) + "()" + parenOld.substring(k, l);
        			if (!seen.contains(parenNew)) {
        				seen.add(parenNew);
        			}
        		}
        	}
        	paren.addAll(seen);
        	seen.clear();
        }
        return paren;
    }
}