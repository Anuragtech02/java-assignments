import java.util.Scanner;
public class SumOfTwoInteger 
{
    public static boolean sumoftwo(int p, int q, int r)
        {	
            return ((p + q) == r || (q + r) == p || (r + p) == q);	
        }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = sc.nextInt();  
		System.out.print("Input the second number : ");
		int y = sc.nextInt(); 
		System.out.print("Input the third number : ");
        int z = sc.nextInt(); 
        sc.close();
        System.out.print("The result is : "+sumoftwo(x, y, z));
    }
}