public class Pattern {

    public static void main(String args[]) {
	int number = 1;
	for(int i = 0; i < 6; i++){
		for(int j = 6; j >= number; j--){
			System.out.print(j);
		}
		System.out.println();
		number++;
	}
	}
}