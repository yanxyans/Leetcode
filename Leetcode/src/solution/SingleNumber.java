package solution;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ nums[i];
        }
        return ret;
    }
}
