public class Max_Min {
    public static void main(String[] args) {
        
        int [] nums = {1,54,-69,23,-54,65,-100};

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i< nums.length;i++)
        {
            int curr = nums[i];
            if(curr > max)
                {
                    max = curr;
                }
             else if(curr < min)
                {
                    min = curr;
                }
        }

        System.out.println(max);
        System.out.println(min);

    }
    
}
