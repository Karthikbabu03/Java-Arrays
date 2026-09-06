import java.util.*;

public class Add_ArrForm 
{
    public static void main(String[] args) 
    {
        List <Integer>  list = new  ArrayList<>();    
        int nums[] = {1,2,0,0};
        int k = 34;
        int carry = 0;
        int index = nums.length-1;

        
        while(index >= 0 || k>0)
        {
            int lastdigit = index<0?0:nums[index];
            int digit = k%10;
            int total = lastdigit+digit+carry;
            list.add(0,total%10);
            carry = total/10;
            k /=10;
            index--;
        }
        if(carry > 0)
        {
            list.add(0,carry);
        }
        System.out.println(list);
    }
}

        
