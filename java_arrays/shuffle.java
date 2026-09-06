import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};

        int n = nums.length/2;
        int [] shuffle = new int[nums.length];
        int Index = 0;
       
        for(int i = 0; i < nums.length-1; i+=2)
            {
                shuffle[i] = nums[Index];
                shuffle[i+1] =nums[Index + n];
                Index++;  
           }
        System.out.println(Arrays.toString(shuffle));
        }
       
    }
    