package javaBasic;
public class DataTypesDemo {

    int a; //checking default values
    boolean bool; //checking default values
    char ch; //checking default values
    float fl; //checking default values
    String s; //checking default values

    public void test() {

        int a=10;
        int b=20;
        float c=10.2f;
        long l=176876876;
        double d=726.5;
        String s = "Ram";

        double d1=a; // will show 10.0
        b=(int)l;
        l=(long)d;
        b=(int)c;

        System.out.println(d1); //10.0
        System.out.println(l); //726
        System.out.println(b); //10
    }

    public static void main(String[] args) {

        DataTypesDemo d=new DataTypesDemo();

        d.test();

        System.out.println("Integers default values:    " + d.a); //0
        System.out.println("Boolean default values:     " + d.bool); //false
        System.out.println("Char default values:    " + d.ch); //
        System.out.println("Float default values:   " + d.fl); //0.0
        System.out.println("String default values:  " + d.s); //null


    }

}
