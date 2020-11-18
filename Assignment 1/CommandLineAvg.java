class CommandLineAvg {
    public static void main(String args[]) {

        int sum = 0, ans = 0;

        for (int i = 0; i < 5; i++) {

            sum = sum + Integer.parseInt(args[i]);

        }

        ans = sum / 5;

        System.out.println("Average of arguments is " + ans);

    }
}
