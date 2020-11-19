public class SumNaturalNo {

    public static void main(String args[]) {
	int sum = 0;
	for(int i = 1; i <= 100; i++)
		sum = sum + i;  
	System.out.print("Sum of natural numbers from 1 to 100 (By for loop) is : " +sum);
	int sum1 = 0;
	int i = 1;
	while(i <= 100){
		sum1 = sum1 + i;
		i++;
	}  
	System.out.print("\nSum of natural numbers from 1 to 100 (By while loop) is : " +sum1);
	int sum2 = 0;
	int j = 1;
	do{
		sum2 = sum2 + j;
		j++;
	}while(j <= 100);  
	System.out.print("\nSum of natural numbers from 1 to 100 (By do while loop) is : " +sum2); 
   
    }

}