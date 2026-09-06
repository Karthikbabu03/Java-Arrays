import java.util.*;

public class Merge1 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //Array1
     int size1 = sc.nextInt();
     int arr1[] = new int[size1];

     for(int i =0; i<size1;i++)
     {
        arr1[i] = sc.nextInt();
     }
    //Array2
     int size2 = sc.nextInt();
     int arr2[] = new int[size2];

     for(int i = 0;i<size2;i++)
     {
        arr2[i] = sc.nextInt();
     }
     //MergeArray
     int Total = size1+size2;
     int merge[] = new int[Total];
     System.arraycopy(arr1,0,merge,0,size1);
     System.arraycopy(arr2,0,merge,size1,size2);
     
    //  for(int j =0;j<size1;j++)
    //  {
    //      merge[j] = arr1[j];
    //  }
     
    //  for(int j = 0;j<size2;j++)
    //  {
    //      merge[size1+j] = arr2[j];
         
    //  }
     Arrays.sort(merge);
     System.out.println(Arrays.toString(merge));
     sc.close();
     
     
    }
}