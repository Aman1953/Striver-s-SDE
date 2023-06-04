// Brute Force

class Solution {
    public void setZeroes(int[][] matrix) {
int length_row = matrix.length;
        int length_column = matrix[0].length;
        int[] row = new int[length_row];
        int[] column = new int[length_column];
        Arrays.fill(row, 1);
        Arrays.fill(column, 1);


        for (int i = 0; i < length_row; i++) {
            for (int j = 0; j < length_column; j++) {
                if (matrix[i][j] == 0){
                    row[i] = 0;
                column[j] = 0;}
            }
        }


        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (row[i] == 0 || column[j] == 0)
                    matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < length_row; i++) {
            for (int j = 0; j < length_column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}