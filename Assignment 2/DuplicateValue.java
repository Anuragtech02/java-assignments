import java.util.Scanner;

public class DuplicateValue {

    public static void main(String args[]) {
	int a[] = {11, 76, 11, 32, 28, 76, 80};
	int i = 0, k = 1;
	for(i = 0; i < 7; i++){
		for(int j = i + 1; j < 7; j++){
	if(a[i] == a[j]){
		System.out.println("Found dublicate value, it is " + a[i]);
		k = 0;
		}
		}
	}
	if(k == 1)
    		System.out.println("No Dublicate value is present in the array");
	}
}