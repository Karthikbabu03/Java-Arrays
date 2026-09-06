import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        
        int [] nums = {10,20,30,40,50};

        int position = 5;
        for (int i = 0; i < nums.length-1;i++)
        {
            if (i >= position)
                {
                    nums[i]=nums[i+1];
                }
        }
        nums[nums.length-1] = 0;
           
        System.out.println(Arrays.toString(nums));
    }
    
}
