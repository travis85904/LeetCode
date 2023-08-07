import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortColorsTest {

    @Test
    void test1() {
        SortColors sortColors = new SortColors();
        int[] nums = sortColors.sortColors(new int[]{2, 0, 2, 1, 1, 0});
        Assertions.assertEquals(Arrays.toString(new int[]{0, 0, 1, 1, 2, 2}), Arrays.toString(nums));
    }

    @Test
    void test2() {
        SortColors sortColors = new SortColors();
        int[] nums = sortColors.sortColors(new int[]{1, 1, 2, 1, 1, 0, 0, 2, 1, 2});
        Assertions.assertEquals(Arrays.toString(new int[]{0, 0, 1, 1, 1, 1, 1, 2, 2, 2}), Arrays.toString(nums));
    }

    @Test
    void test3() {
        SortColors sortColors = new SortColors();
        int[] nums = sortColors.sortColors(new int[]{2, 1, 1, 2, 0, 0});
        Assertions.assertEquals(Arrays.toString(new int[]{0, 0, 1, 1, 2, 2}), Arrays.toString(nums));
    }

    @Test
    void test4() {
        SortColors sortColors = new SortColors();
        int[] nums = sortColors.sortColors(new int[]{1, 2, 0, 0, 2, 2, 0, 1, 1});
        Assertions.assertEquals(Arrays.toString(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}), Arrays.toString(nums));
    }

    @Test
    void test5() {
        SortColors sortColors = new SortColors();
        int[] nums = sortColors.sortColors(new int[]{2, 1, 1, 0});
        Assertions.assertEquals(Arrays.toString(new int[]{0, 1, 1, 2}), Arrays.toString(nums));
    }

}
