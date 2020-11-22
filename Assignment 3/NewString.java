import java.util.Scanner;
public class NewString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();
        sc.close();  
        int length1 = str1.length();
	    int length2 = str2.length();
        String result = "";
	    if(length1 <= 0)
            result = result + '#';
        else
            result = result + str1.charAt(0);
        if(length2 <= 0)
            result = result + '#';
        else
            result = result + str2.charAt(length2 - 1);
	    System.out.println(result);
    }
}