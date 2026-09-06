import java.util.Arrays;

public class MatrixMultiplication {
    public static int[][] multiplication(int [][]a,int[][]b){
        int[][] matrix = new int[a.length][b[0].length];
        for(int row = 0;row<a.length;row++){
            for(int col = 0;col<b[0].length;col++){
                int sum =0;
                for(int  i = 0;i<b.length;i++){
                    sum += (a[row][i]*b[i][col]); 
                }
                matrix[row][col] = sum ;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int [][] a = {{1,2},{3,4},{5,6}};
        int[][] b = {{7,8,9},{10,11,12}};
        int [][] matrix = multiplication(a, b);
        for(int rows[]:matrix)
            {
                    System.out.println(Arrays.toString(rows));
            } 
    }
    
}
