

public class SortColors {

    public int[] sortColors(int[] nums) {
        int tmp;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                tmp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = tmp;
                i = -1;
            }
        }
        return nums;
    }
}
