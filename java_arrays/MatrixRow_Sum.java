import java.util.*;
public class MatrixRow_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No of Rows:");
        int row = sc.nextInt();

        System.out.print("No of columns:");
        int cols = sc.nextInt();

        int Even =0, Odd = 0;

        int [][] matrix =  new int[row][cols];
        //for entering elements;
        for(int i = 0; i<row;i++)
        {
            for(int j= 0;j<cols;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        // to display the matrix;
        System.out.println("--------Matrix-------");
        for (int[] rows: matrix) 
            {
                for (int element : rows) 
                {
                    System.out.print(element + " ");
                }
                    System.out.println();
            }
         
            for(int i=0;i<row;i++)
            {
                for(int j = 0;j<cols;j++)
                {
                    if(i%2==0)
                    {
                        Even +=matrix[i][j];
                    }
                    else{
                        Odd +=matrix[i][j];
                    }
                }
            }   
            
            System.out.println("Odd sum:"+Odd +"  " + " Even sum:" + Even);

            int diff = Math.abs(Odd-Even);
            System.out.println("Differnece:"+diff);
            sc.close();
            
            

    }

    
}
