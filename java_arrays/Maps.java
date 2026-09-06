import java.util.*;
public class Maps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> rikith = new HashMap<>();
        int MaxFrequency = 0;
        int number =0;

        System.out.print("Enter the no of elements:");
        int size = sc.nextInt();

        int [] nums = new int [size];

        System.out.println("Enter the elements in the array");

        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Give array:"+Arrays.toString(nums));
        
        for (int n :nums)
        {
           rikith.put(n, rikith.getOrDefault(n,0)+1);
        }

        // for (int i :rikith.keySet())
        // {
        //     System.out.println(i+":"+ rikith.get(i));
        // }
        for (int karthik : rikith.keySet())
        {
              if(rikith.get(karthik) > MaxFrequency)
              {
                MaxFrequency = rikith.get(karthik);
                number = karthik;
              }
        }
        System.out.println("Max repeated number: "+number);
        sc.close();

    }

    
}
