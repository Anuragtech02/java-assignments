import java.util.Scanner;
//import java.util.Array;

public class SortArray {

    public static void main(String args[]) {
	int a[] = {13, 16, 19, 20, 25, 1};
	System.out.print("Array before sorting is: ");
	for(int i = 0; i < 6; i++)
		System.out.print( "\n" + a[i]);
	System.out.print("\nArray after sorting is: ");
	for(int j = 0; j < 6; j++){
		int b = a[j];
		for(int k = j; k < 6;k++){
			if(a[k] < b){
			a[j] = a[k];
			a[k] = b;
			}
		}
	}
	for(int i = 0; i < 6; i++)
		System.out.print( "\n" + a[i]);
	String s[] = {"Zimbabwe", "South-Africa", "India", "America", "Yugpslavia"};
	System.out.print("\nArray before sorting is: ");
	for(int i = 0; i < 5; i++)
		System.out.print( "\n" + s[i]);
	System.out.print("\nArray after sorting is: ");
	for(int j = 0; j < 5; j++){
		int b = a[j];
		for(int k = j + 1; k < 5;k++){
			if( s[j].compareTo(s.[k]) > 0 ){
			String temp = s[j];
			s[j] = s[k];
			s[k] = temp;
			}
		}
	}
	for(int i = 0; i < 5; i++)
		System.out.print( "\n" + s[i]);
     }

}
