//Justification are given in comments

public class ParameterPass {
    public static void main(String[] args) {
        int i = 0;
        //Value of i is incremented by 1 in global scope inside the function argument of addTwo
        addTwo(i++);
        System.out.println(i);
    }
    
    static void addTwo(int i) {
       //Value of i is incremented by 2 in the scope of this function (addTwo)
        i += 2;
       
    }
}  