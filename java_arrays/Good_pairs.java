
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i = 0; i < nums.length;i++)
        {
            for (int j = i+1; j < nums.length;j++ )
            {
                if (nums[i]== nums[j]) count++;
            }
        }
        return count;
        
    }
}

public class Good_pairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
           Solution sol = new Solution() ;
        System.out.println(sol.numIdenticalPairs(nums));
    }
    
}
