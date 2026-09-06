import java.util.*;
class kids {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = 0;
        List <Boolean> list = new ArrayList<>();

        for(int i = 0; i < candies.length;i++)
        {
            max = Math.max(max, candies[i]);
        }
        for(int i = 0; i < candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
            {
                list.add(true);
            }
            else
                list.add(false);
        }
        return list;
        
    }
}
public class Main {
    public static void main(String[] args) {

        int []candies = {2,3,5,1,3};
        int Extra = 3;
       Solution sol = new Solution();
        List <Boolean> list = sol.kidsWithCandies(candies,Extra);
        System.out.println(list);
    }
    
}
