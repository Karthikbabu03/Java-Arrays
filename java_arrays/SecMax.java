public class SecMax {
    public static void main(String[] args) {
        
        int [] nums = {-10,-2,-30,-4,10,10,8};

        int first = nums[0];
        int second = nums[0];

        for (int i = 0; i< nums.length;i++)
        {
            int curr = nums[i];
            if(curr > first)
                {
                    second = first;
                    first = curr;
                }
            else if(curr < first && curr > second)
                {
                    second = curr;
                }
        }

        System.out.println("First Max Value:" +first);
        System.out.println("Second Max Value:"+ second);

    }  
}


