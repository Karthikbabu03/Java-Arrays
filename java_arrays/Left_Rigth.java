import java.util.*;
public class Left_Rigth {

    public static void main(String[] args) {
    
        int [] A = {6,7,7,8};
        int [] B = new int[A.length];
        
        int totalsum = 0;
        int LeftSum = 0;
        for(int n : A)
            {
                totalsum += n;
            }
        for (int i = 0 ; i< A.length; i++)
            {
                int RigthSum = totalsum - LeftSum - A[i];
                B[i] = Math.abs(LeftSum - RigthSum);
                LeftSum += A[i];  
            }
                System.out.println(Arrays.toString(B));
    }
}
