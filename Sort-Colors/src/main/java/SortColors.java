

public class SortColors {

    public int[] sortColors(int[] nums) {
        int tmp;
        for (int i = 0; i < nums.length - 1; i++) {
            int cmp = i + 1;
            if (nums[i] > nums[cmp]) {
                tmp = nums[i];
                nums[i] = nums[cmp];
                nums[cmp] = tmp;
                i = -1;
            }
        }
        return nums;
    }
}
