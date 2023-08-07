public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix.length;

        for (int i = 0; i < length; i++) {
            //check if first item the row is greater than target
            if (matrix[i][0] >= target) {
                //check if first item in row equals target
                if (matrix[i][0] == target) {
                    return true;
                    //make sure we are not on the first row and then search
                } else if (i > 0) {
                    for (int j = 0; j < matrix[i - 1].length; j++) {
                        if (matrix[i - 1][j] == target)
                            return true;
                    }
                    //search first row
                } else {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == target)
                            return true;
                    }
                }
            }
        }

        //get length of last row
        int lastRowLength = matrix[length - 1].length - 1;

        //search last row if last item >= target
        if (matrix[length - 1][lastRowLength] >= target) {
            //check if last item in row == target
            if (matrix[length - 1][lastRowLength] == target)
                return true;
            for (int j = 0; j < lastRowLength; j++) {
                if (matrix[length - 1][j] == target)
                    return true;
            }
        }
        return false;
    }
}
