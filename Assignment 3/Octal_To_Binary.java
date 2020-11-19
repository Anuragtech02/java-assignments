//Java program to convert octal number to binary number
import java.util.Scanner;

public class Octal_To_Binary
{
	public static void main(String args[])
	{      
		//scanner class object creation
		Scanner sc = new Scanner(System.in);    
		//input from user
		System.out.print("Enter a octal number : ");
		int octal = sc.nextInt();
		//Declaring variable to store decimal number  
		int decimal = 0;
		//Declaring variable to use in power		
		int n = 0;  
		//writing logic for the octal to decimal conversion
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, n);  
			octal = octal/10;  
			n++;  
		}
		int binary[] = new int[20];
		int i = 0; 
		//writing logic for the decimal to binary conversion 
		while(decimal > 0)
		{       
			int r = decimal % 2;
			binary[i++] = r;
			decimal = decimal/2;
		}
		//printing result
		System.out.print("Binary number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(binary[j]+" "); 
		//closing scanner class(not compulsory, but good practice)
		sc.close(); 
	}
}  