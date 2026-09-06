import java.util.*;

public class MMM {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of the array:");
     int size = sc.nextInt();

     int [] arr = new int[size];

     System.out.println("Enter the elements in the array");

     for (int i = 0;i<size; i++)
     {
        arr[i] = sc.nextInt();
     }
     Arrays.sort(arr);
     System.out.println("Sorted array:"+Arrays.toString(arr));

     double sum = Arrays.stream(arr).sum();
    //  for (int n : arr)
    //  {
    //     sum+=n;
    //  }
    // ---Mean---
    double Mean = sum/size;
    //---Median---
    double Median = 0;

    if(size%2 != 0)
    {
        Median = arr[size/2];
    }
    else 
    {
        Median = ((arr[(size/2)-1]+arr[(size/2)]))/2.0;
    }
    //---Mode---
    HashMap <Integer,Integer> map = new HashMap<>();
    int Max = 0;
    int Mode = 0;
    for (int n : arr)
    {
        int count = map.getOrDefault(n,0)+1;
        map.put(n,count);
        if(count>Max)
        {
            Max=count;
            Mode = n;
        }
    }
    System.out.printf("Mean: %.2f Median: %.2f Mode: %d",Mean,Median,Mode);  
    sc.close();
    }
}