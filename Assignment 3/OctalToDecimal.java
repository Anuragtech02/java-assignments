import java.util.Scanner;

public class OctalToDecimal 
{
    public static void main(String args[]) 
	{
        System.out.print("Enter an Octal number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
		int temp = n, rem;
		int sum = 0, degree = 0, flag = 1;
        while (temp > 0) 
		{
			if(temp % 10 >= 8)
			{
				System.out.println("Invadid octal number");
				flag = 0;
				break;
			}
            temp /= 10;
        }
		if(flag != 0)
			System.out.print("Its decimal form is : ");
		while (n > 0 && flag != 0) 
		{
        	rem = n % 10;
            sum = sum + rem * (int)Math.pow(8, degree);
			n = n / 10;
			degree++;
	    }
        if(flag != 0)
            System.out.print(sum); 
    }
}