import java.util.*;
public class plus_one {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            int []arr = {9,9,9};
            int carry = 0;
            for(int i = arr.length-1;i>=0;i--)
            {   
                if(i == arr.length-1)
                   {
                        int sum = arr[i]+1;
                        list.add(sum%10);
                        carry = sum/10;
                    }
                else
                    {
                        int sum = arr[i] + carry;
                        list.add(sum%10);
                        carry = sum/10;
                    }
                    
            }
            if (carry>0) list.add(carry);
            Collections.reverse(list);
            System.out.println(list);
        }
    
}
