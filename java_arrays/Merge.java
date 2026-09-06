import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the arrays:");
        int size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];
        int[] merge  = new int [2*size];
       
 
        System.out.println("Enter the elements in first array\n");

        for (int i = 0; i < a.length; i++)
        {
            System.out.print("Enter the element at index "+i+ "=");
            a[i]= sc.nextInt();
        }
        
        System.out.println();

        System.out.println("Enter the elements in second array\n");

        for (int i = 0; i < b.length; i++)
        {
            System.out.print("Enter the element at index "+i+ "=");
            b[i]= sc.nextInt();
        }

        System.out.println();
        
       
        for(int j = 0; j < a.length ;j++)
        {
           merge[j] = a[j];
           merge[j+a.length] = b[j];
         
           
        }  
    
        System.out.println( "First array :"+Arrays.toString(a));
        System.out.println("Second array : "+Arrays.toString(b));
        System.out.println("Merged  array"+Arrays.toString(merge));

        sc.close();
    }
    
}
