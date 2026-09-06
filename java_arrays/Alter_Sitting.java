
import java.util.*;

public class Alter_Sitting {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int M = sc.nextInt();
     int count = 0;
     int seats[] = new int[M];
     for(int i=0;i<M;i++)
     {
        seats[i] = sc.nextInt();
     }
     for(int i = 0;i<M;i++)
     {
        if(seats[i] == 0 &&(i ==0 || seats[i-1] ==0) && (i==M-1||seats[i+1]==0))
        {
            seats[i] = 1;
            count++;
        if(count==N) break;
        }
     }
     if(count == N) System.out.println("YES");
     else System.out.println("NO");
     sc.close();
    }
}