import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int product = 1;
            for(int j=0; j<nums.length; j++) {
                if(i != j) {
                    product *= nums[j];
                }
            }
            res[i] = product;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution(); // Create object to call non-static method
        int num[] = {5, 2, 5, 4, 1};
        // Use Arrays.toString() to print the array contents
        System.out.println(Arrays.toString(sol.productExceptSelf(num)));
    }
} // Removed the extra duplicate bracket that was here
