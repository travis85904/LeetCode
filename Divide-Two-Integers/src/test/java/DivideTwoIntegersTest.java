import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideTwoIntegersTest {

    @Test
    void test1() {
        Assertions.assertEquals(3, new DivideTwoIntegers().divide(10, 3));
    }

    @Test
    void test2() {
        Assertions.assertEquals(-2, new DivideTwoIntegers().divide(7, -3));
    }

    @Test
    void test3() {
        Assertions.assertEquals(9, new DivideTwoIntegers().divide(18, 2));
    }

    @Test
    void test4() {
        Assertions.assertEquals(-13, new DivideTwoIntegers().divide(40, -3));
    }

    @Test
    void test5() {
        Assertions.assertEquals(58, new DivideTwoIntegers().divide(-175, -3));
    }

    @Test
    void test6() {
        Assertions.assertEquals(0, new DivideTwoIntegers().divide(0, 1));
    }

    @Test
    void test7() {
        Assertions.assertEquals(17, new DivideTwoIntegers().divide(85, 5));
    }

    @Test
    void test8() {
        Assertions.assertEquals(2147483647, new DivideTwoIntegers().divide(-2147483648, -1));
    }

}
