import java.util.Arrays;

public class Row_Col_Sum {
    public static void main(String[] args) {
        int[][] matrix = {
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};
        
        int row = 0;
        int collen = matrix[0].length;
        while (row<matrix.length) 
        {
            int RowSum =0;
            for(int i =0;i<collen;i++) RowSum += matrix[row][i];
          System.out.println("Sum of the row"+row+" = "+RowSum);  
          row++;
        }
        System.out.println();
        for(int []rows:matrix)
        {
            System.out.println(Arrays.toString(rows));

        }
        
    }
    
}
