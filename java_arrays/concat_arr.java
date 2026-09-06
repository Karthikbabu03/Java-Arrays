import java.util.*;

public class concat_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int [] nums = new int[size];
        int [] ans  = new int[2*size];
        int Index= 0;

        for (int i=0; i < size; i++)
        {
            System.out.println("Enter the number at index" +i+ "=");
            nums[i] = sc.nextInt();
        }

        System.out.println("The orginal array :"+Arrays.toString(nums));

        for (int j = 0; j <  size; j++)        
                                                   
        {
            ans[j] = nums[j];
        }
        for (int k = size; k < ans.length;k++, Index++)
        {
                ans[k] = nums[Index];
               
        }
       

        // Optimal method
        // for (int j = 0; j < size; j++)
        //     {
        //         ans[j] = nums[j];
        //         ans[j+size] = nums[j];
        //     }

            
        System.out.println("New Array:"+Arrays.toString(ans));
        sc.close();
    }
    
}
