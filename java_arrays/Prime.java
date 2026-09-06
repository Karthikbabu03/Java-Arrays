import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Starting number:");
        int start = sc.nextInt();
        int num = start;
        System.out.print("Enter the Ending number:");
        int end = sc.nextInt();
        int count = 0;
        if(start==0 && end ==1) 
            {
                System.out.printf("%d and %d both are not prime\n",start,end);
                // System.out.printf("There are %d prime from %d to %d\n",count,start,end);
            }
        
        else
        {
            for(int i=start;i<=end;i++)
                {
                        if((num/i==num || num/i==1))
                        {
                            System.out.print(i+" ");
                            count++;
                            num++;
                            if(num>end) break;
                        }
                            // for(int j=start;j<=end;j++)
                            // {
                            //     if(i%j==0 && i!=j)
                            //     {
                            //          System.out.print(i+" ");
                            //          count++;
                            //     }
                
                            // }
                }
    }
        System.out.println();
        System.out.printf("There are %d prime from %d to %d\n",count,start,end);
        sc.close();
        
    }
    
}
