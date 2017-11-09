package solution;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int wordEnd = s.length() - 1;
        while (wordEnd > -1 && s.charAt(wordEnd) == ' ') {
            wordEnd--;
        }
        
        if (wordEnd < 0) {
            return 0;
        }
        
        int wordStart = wordEnd;
        while (wordStart > -1 && s.charAt(wordStart) != ' ') {
            wordStart--;
        }
        
        return wordEnd - wordStart;
    }
}
