public class MaxMinValue {

    public static void main(String args[]) {
	int a[] = {11, 76, 90, 32, 28, 1};
	int max = a[0], min = a[0];
	System.out.println("Values in array are: ");
	for(int i = 0; i < 6; i++){
	System.out.print(a[i] + " ");
	if(a[i] > max)
		max = a[i];
	if(a[i] < min)
		min = a[i];
	}
    	System.out.println("\nMax value is: "+ max +"\nMin value is " + min);
	}
}