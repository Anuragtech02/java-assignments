public class SumOfTwoMatrix {

    public static void main(String args[]) {
	int a[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	int b[][] = { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} };
	System.out.println("1st Matrix is:\n");
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++)
			System.out.print(a[i][j] + " ");
		System.out.println();
	}
	System.out.println("2nd Matrix is:/n");
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++)
			System.out.print(b[i][j] + " ");
		System.out.println();
	}
	System.out.println("Sum of these two Matrix is:/n");
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++)
			System.out.print(a[i][j] + b[i][j] + " ");
		System.out.println();
	}
   	}
}