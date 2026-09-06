import java.util.Arrays;
import java.util.Scanner;
public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][] = new int [3][3];
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter the elments for new Matrix");
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                matrix[i][j] += sc.nextInt();
            }
        }
        for(int n[]: matrix)
        {
            System.out.println(Arrays.toString(n));
        }
        sc.close();


    }
    
}
