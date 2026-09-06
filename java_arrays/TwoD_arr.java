import java.util.*;
public class TwoD_arr
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns:");
        int col = sc.nextInt();

        int[][] nums = new int[rows][col];

        for(int i = 0; i < nums.length;i++)
        {
            System.out.println("Your at "+i+ "row");
            for(int j = 0; j < nums[i].length; j++)
            {
                System.out.print("Enter the number at "+j+ "column:");
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(nums));           // this only applicable for int[]	 == Arrays.toString(arr)
        System.out.println(Arrays.deepToString(nums));      // this only applicable for int[][]	 == Arrays.deepToString(arr)
    
    
    
    
        for(int n[] : nums )        // this normal method to print elements in 2D array (Nested Loops)
        {
           for (int m :n)
            {
                System.out.print(m +" ");
           }
           System.out.println();
        }
        sc.close();
    }
}    