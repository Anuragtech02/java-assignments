public class PatternStar {

    public static void main(String args[]) {
	int number = 1, space = 4;
	for(int i = 0; i < 9; i++){
		for(int j = 1; j <= space; j++)
			System.out.print(" ");
		for(int k = 1; k <= number; k++)
			System.out.print("* ");
		if(i < 4){
			number++;
			space--;
		}
		else{
			number--;
			space++;
		}
		System.out.println();
	}
	}
}