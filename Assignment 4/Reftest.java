/*
class calltest{
    public static void main (String a[]){
    String s=new String("English");
    fun(s);
    System.out.println(s);
    }
    static void fun(String s){
    System.out.println(s);
    s="Hindi";
    System.out.println(s);
    }}
*/
    
// Output
// English
// Hindi
// English

///////////////////////////////////////////
      //  Second code  //

class intc{
    int x;
    }
class Reftest{
    public static void main (String a[]){
    intc o=new intc();
    fun(o);
    System.out.println(o.x);
    }
    static void fun(intc s){
    System.out.println(s.x);
    s.x=10;
    System.out.println(s);
    }}


// Output
// 0
// intc@136432db
// 10

// Note to self