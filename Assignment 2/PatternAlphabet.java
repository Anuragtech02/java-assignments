public class PatternAlphabet {

    public static void main(String args[]) {
	char a = 'a';
	char b = 'b';
	for(int i = 0; i < 6; i++){
		for(a = 'a'; a != b; a++){
			if(a == 'a')
				System.out.print("(" + a);
			else
				System.out.print("+" + a);
		}
		System.out.print(")\n");
		b++;
	}
	}
}