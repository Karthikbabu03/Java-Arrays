import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
         
        int [] nums = {0,1,2,3,4,5,6,7};
        // int length = nums.length-1;
        int position = 2;
        int value = 10;

        for (int i = 1; i <= position;i++)
        {
              nums[i-1] = nums[i];
        }
        nums[position] = value;
        System.out.println(Arrays.toString(nums));
    }
    
}
