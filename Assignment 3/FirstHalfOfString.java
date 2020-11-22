//import java.lang.*;
import java.util.Scanner;
public class FirstHalfOfString 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        sc.close();    
        System.out.println(s.substring(0, s.length()/2));	
    } 
}