import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) 
    {
        int [] runningSum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            sum += nums[i];
            runningSum[i] = sum;
        }  
        return runningSum;
    }
}
 public class Running_sum
{
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};
        Solution sol = new Solution();
        
        int result[] = sol.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}