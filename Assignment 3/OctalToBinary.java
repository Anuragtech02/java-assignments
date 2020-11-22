import java.util.Scanner;

public class OctalToBinary 
{
    public static void main(String args[]) 
	{
        System.out.print("Enter an Octal number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
		int temp = n, rem;
		int count = -1;
        while (temp > 0) 
		{
			if(temp % 10 >= 8)
			{
				System.out.println("Invadid octal number");
				count = -1;
				break;
			}
            temp /= 10;
            count++;
        }
		if(count != -1)
			System.out.print("Its binary form is : ");
		while (count >= 0) 
		{
			int a = (int)Math.pow(10, count);
        	rem = n / a;
			switch(rem)
			{
				case 0:
					System.out.print("000");
					break;
				case 1:
					System.out.print("001");
					break;
				case 2:
					System.out.print("010");
					break;
				case 3:
					System.out.print("011");
					break;
				case 4:
					System.out.print("100");
					break;
				case 5:
					System.out.print("101");
					break;
				case 6:
					System.out.print("110");
					break;
				case 7:
					System.out.print("111");
					break;
			}
			n = n % a;
			count--;
	    }
    }
}