class CommandLineAvg {
    public static void main(String args[]) {

        int sum = 0, ans = 0;

        for (int i = 0; i < args.length; i++) {

            sum = sum + Integer.parseInt(args[i]);

        }

        ans = sum / args.length;

        System.out.println("Average of arguments is " + ans);

    }
}
