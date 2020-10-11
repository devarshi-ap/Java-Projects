/**
* MultiplyMatrices.java
* @author Devarshi Patel
* @since 2020-10-06
*
* This class multiplies two 2-dimensional arrays.
* Checks if dimensions match before multiplying.
* 3-level nested for-loops to evaluate elements.
*   - Need an index to traverse row elements of first matrix
*     plus the column elements of the second matrix
*/


public class MultiplyMatrices {


    public static int[][] multiply(int[][]m1, int[][]m2){
        // all elements are initialized to be zeros
        int[][] answer = new int[m1.length][m2[0].length];

        for(int row = 0; row < m1.length; row++){
            for(int column = 0; column < m2[0].length; column++){
                for(int i = 0; i < m1[0].length; i++){
                    answer[row][column] += m1[row][i] * m2[i][column];
                }
            }
        }

        return answer;
    }

    
    public static void main(String[] args) {
        
        //Play around with the values
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};   // 2 by 3 matrix
        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};   // 3 by 2 matrix

        /*
        * According to the rules of matrix multiplication, the #columns in the
        * first matrix has to be the same as the #rows in the second matrix
        */

        if(matrix1[0].length != matrix2.length) {
                System.out.println("Multiplication Undefined.");

        } else {
            int[][] result = multiply(matrix1, matrix2);
            for(int row = 0; row < result.length; row++){
                for(int column = 0; column < result[0].length; column++){
                    System.out.print(result[row][column] + " ");
                }
                System.out.println();
            }
        }

    
    }
}
