/*
public class Static {
    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public void third() { System.out.println(name); }
    public static void main(String args[]) {
    first();
    second();
    third();
    } }
    
*/
    //Error -  ClassNotFoundException: Static
    //Error - Cannot make a static reference to the non-static field name

public class Static {
    public static String name = "Static class"; // class should be public static
    public static void first() { }
    public static void second() { }
    public static void third() { System.out.println(name); } // third should be static class
    
    public static void main(String args[]) {
    first();
    second();
    third();
        } }