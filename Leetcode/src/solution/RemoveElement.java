package solution;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (len != i) {
                    nums[len] = nums[i];
                }
                len++;
            }
        }
        return len;
    }
}
