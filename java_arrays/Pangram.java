import java.util.*;
public class Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result = true;
       

        System.out.print("Enter the String:");
        String str = sc.nextLine();

        str = str.toLowerCase().replaceAll("[^a-z]","");
        if(str.length() < 26) 
        {
            result = false;
        }
        
        else
        {
            for (int i =0 ; i < 26; i++)
                {
                    char alpha = 'a';
                    char res = (char)(alpha +i);
                    boolean found = false;
                    for(int j =0; j<str.length();j++)
                    {
                        if (str.charAt(j) == res) 
                            {
                                found = true;
                                break;
                            }
                    }
                    if(!found)
                    {
                        result = false;
                    }
                }
        }
        System.out.println(result);
        sc.close();
    }
    
}
