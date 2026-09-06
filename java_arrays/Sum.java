import java.util.Scanner;
public class Sum
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int sum = 0;
	    
		System.out.print("Enter the no. of elements you want to enter:");
		int size = sc.nextInt(); 
		
		int [] arr = new int[size];
		
		for (int i = 0; i < size; i++)
		{
		    System.out.print("Enter the Number at Index no " +i+ " = ");
		    int num = sc.nextInt();
		    arr[i] = num;
		    
		}
		
		for (int i = 0; i < size; i++)
		{
		    sum += arr[i];
		}
         System.out.println("Sun of ELememts in the array:"+sum);
         sc.close();
		
	}
}