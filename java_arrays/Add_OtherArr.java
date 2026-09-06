import java.util.Arrays;

public class Add_OtherArr {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[arr1.length];
        int [] rev_arr = new int[arr1.length];
        int j  = arr1.length-1;

        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
      
        // System.out.println("Copying the elements into new array in revese order");

        for (int k =0;k < arr1.length; k++)
        {
            rev_arr[j] = arr1[k];
            j--;
        }
        System.out.println("Orginal Array:" +Arrays.toString(arr1));
        System.out.println("New Array:" +Arrays.toString(arr2));
        System.out.println("Rev Array:" +Arrays.toString(rev_arr));


    }
    
}
