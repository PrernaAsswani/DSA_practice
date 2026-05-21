public class largest_no_matrix {
    public static void main(String[] args) {
        int [][] matrix = {
            {1, 2, 30},
            {4, 15, 6},
            {7, 8, 9}
        };
        int largest = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest number in the matrix is: " + largest);
    }
}
