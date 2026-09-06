import java.util.*;
public class MatrixCol_Sum {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int row = sc.nextInt();
     int cols = sc.nextInt();
     int matrix[][] = new int[cols][row];
     for(int i  = 0;i<row;i++)
     {
        for(int j = 0;j<cols;j++)
        {
            matrix[i][j] = sc.nextInt();
        }
     }
     int j =0;
     int sum=0;
     while(j<cols)
     {
     for(int i = 0;i<row;i++)
     {
        if(j<cols) sum += matrix[i][j];
     }
     System.out.println(sum);
        j++;
        sum =0;
      }
      sc.close();
    }
}
    
