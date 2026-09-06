import java.util.*;
public class MatrixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  row = sc.nextInt();
        int cols = sc.nextInt();
        int matrix [][] = new int[row][cols];
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<cols;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int []rows:matrix)
        {
            for(int n : rows)
            {
                Max = Math.max(Max, n);
                Min = Math.min(n, Min);
            }
        }
        System.out.printf("Max number:%d"+"  "+"Min number:%d",Max,Min);
        sc.close();
    }
    
}
