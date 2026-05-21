public class minimum_no_matrix {
    public static void main(String[] args) {
        int [] [] matrix = {
            {1, 2, 30},
            {4, 55, 6},
            {7, 8, 90}
        };
        int minimum = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < minimum) {
                    minimum = matrix[i][j];
                }
            }
        }
        System.out.println("The minimum number in the matrix is: " + minimum);
    }
}
