import java.util.*;
public class First_Last {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    int [] arr = new int[size];
    int first = -1, last =-1;
    // int last = -1;

    for(int i=0; i<size;i++)
    {
        arr[i] = sc.nextInt();
    }

     int target = sc.nextInt();

    for(int i = 0;i<size;i++)
     {
        if(arr[i]==target) {
            last = i;
            if(first == -1)
            {
                first =i;
            }
        }
     }
                    //  for(int i = 0;i<size;i++)
                    //  {
                    //     if(arr[i]== target)
                    //     {
                    //         first = i;
                    //         break;
                    //     }
                    //  }

    System.out.println(first + " " + last);
    sc.close();
    }
}

