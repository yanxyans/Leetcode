package solution;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        while (j < n) {
            while (j < n - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
            
            nums[i++] = nums[j++];
        }
        return i;
    }
}
