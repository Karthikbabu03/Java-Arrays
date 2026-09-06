import java.util.Arrays;

public class Rev_Array {
    public static void main(String[] args) {
    int [] nums ={1,2,3,4,5,6};
    // int len = nums.length-1;
    int temp = 0;
    for(int i=0;i<=(nums.length-1)/2;i++)
    {
        temp = nums[i];
        nums[i] = nums[nums.length-1-i];
        nums[nums.length-1-i] = temp;

    }
//    int left =0, right = nums.length-1;
//    while (left<right) {
//     temp = nums[right];
//     nums[right] = nums[left];
//     nums[left] = temp;
//     left++; right--;
// }
    System.out.println(Arrays.toString(nums));
    // for(int i = nums.length-1;i>=0;i--)
    // {
    //     System.out.print(nums[i]+" ");
    // } // Output = 5 4 3 2 1
    
  }
}
 