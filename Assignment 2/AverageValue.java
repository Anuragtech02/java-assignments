public class AverageValue {

    public static void main(String args[]) {
	int a[] = {11, 76, 90, 32, 28, 1};
	double sum = 0;
	double average = 0;
	System.out.println("Values in array are: ");
	for(int i = 0; i < 6; i++){
		System.out.print(a[i] + " ");
		sum = sum + a[i];
	}
	average = sum / 6;
    	System.out.println("\nAverage value is: "+ average);
	}
}