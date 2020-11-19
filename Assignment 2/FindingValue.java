import java.util.Scanner;

public class FindingValue {

    public static void main(String args[]) {
	int a[] = {11, 76, 90, 32, 28};
	System.out.println("Enter the value :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
	int i = 0;
	for(i = 0; i < 5; i++){
	if(a[i] == n){
		System.out.println("Found "+ n +" at index " + (i+1));
		break;
		}
	}
	if(i == 5)
    		System.out.println("Value "+ n +" is not present in the array");
	}
}