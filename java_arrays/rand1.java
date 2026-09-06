
import java.util.*;

public class rand1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Random random = new Random();
    int OrgSum = 100 * 101/2;
    int listSum = 0;
    

    List<Integer> list = new ArrayList<>();
    while(list.size() < 99)
        {
            int num = random.nextInt(100)+1;
            if(!list.contains(num)) list.add(num);
        }
          System.out.println(list);
          System.out.println(list.size());
          for(int n : list)
          {
              listSum += n;
          }
          System.out.println(listSum);
           System.out.println(OrgSum-listSum);
          
          
        //   for(int j = 0 ; j < list.size();j++)
        //   {
        //       int ans = list.get(j);
        //       System.out.println(list.contains(ans) + " " + ans);
        //   }
    // for(int i=0; i< list.size();i++)
    //     {
    //         int n = list.get(i);
    //         if(!list.contains(n)) 
    //           System.out.println(n);  
    //     }
    sc.close();
        
    }
}