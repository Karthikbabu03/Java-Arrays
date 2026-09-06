import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements you want to enter:");
        int size = sc.nextInt();

        int [] nums = new int[size];
        int [] Odd = new int[size];
        int [] Even = new int[size];

        int IndexO = 0;
        int IndexE = 0;

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the element at index "+ i+" = ");
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        for (int n = 0 ; n < size;n++)
        {
            if(nums[n] %2 == 0)
            {
                Even[IndexE] = nums[n];
                IndexE++;
            }
            else
            {
                Odd[IndexO] = nums[n];
                IndexO++;
            }

        }

        System.out.println(Arrays.toString(Even));
        System.out.println(Arrays.toString(Odd));
        
        sc.close();
    }

    
}
