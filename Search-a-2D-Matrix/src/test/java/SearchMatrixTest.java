import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchMatrixTest {

    @Test
    public void trueTest1(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertTrue(searchMatrix.searchMatrix(matrix, 30));
    }
    @Test
    public void trueTest2(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertTrue(searchMatrix.searchMatrix(matrix, 16));
    }
    @Test
    public void trueTest3(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertTrue(searchMatrix.searchMatrix(matrix, 1));
    }
    @Test
    public void trueTest4(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertTrue(searchMatrix.searchMatrix(matrix, 7));
    }
    @Test
    public void trueTest5(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertTrue(searchMatrix.searchMatrix(matrix, 78));
    }
    @Test
    public void trueTest6(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertTrue(searchMatrix.searchMatrix(matrix, 23));
    }
    @Test
    public void falseTest1(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertFalse(searchMatrix.searchMatrix(matrix, 0));
    }
   @Test
    public void falseTest2(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertFalse(searchMatrix.searchMatrix(matrix, -6));
    }
   @Test
    public void falseTest3(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertFalse(searchMatrix.searchMatrix(matrix, 4));
    }
   @Test
    public void falseTest4(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertFalse(searchMatrix.searchMatrix(matrix, 27));
    }
   @Test
    public void falseTest5(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertFalse(searchMatrix.searchMatrix(matrix, 70));
    }
   @Test
    public void falseTest6(){
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {71, 72, 73, 74}, {75, 76, 77, 78}};
        Assertions.assertFalse(searchMatrix.searchMatrix(matrix, 99));
    }


}
