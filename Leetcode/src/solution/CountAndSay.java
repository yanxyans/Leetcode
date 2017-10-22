package solution;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n < 0) {
            return "";
        }
        
        String ret = "1";
        StringBuilder newRet = new StringBuilder();
        for (int i = 1; i < n; i++) {
            int len = ret.length();
            int j = 0;
            int num = 0;
            int cnt = 0;
            newRet.setLength(0);
            while (j < len) {
                int k = ret.charAt(j++) - '0';
                if (k == num) {
                    cnt++;
                } else {
                    if (num != 0) {
                        newRet.append(cnt);
                        newRet.append(num);
                    }
                    num = k;
                    cnt = 1;
                }
            }
            newRet.append(cnt);
            newRet.append(num);
            ret = newRet.toString();
        }
        return ret;
    }
}
