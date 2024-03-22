package javaBasic;
public class Company {

    int a=10; //instance variable
    static int b=40; // static variable - space allocated for this at compile time
    public static void main(String[] args) {

        Company c= new Company();
        System.out.println(c.a); // 10
        System.out.println(b); //40 here we can directly call static variable
        System.out.println("....................");

        c.a+=10; //20
        b+=20; //60

        System.out.println(c.a); //20
        System.out.println(b);  //60

        System.out.println("....................");

        Company c1= new Company();
        System.out.println(c1.a); //10
        System.out.println(b); //60 - as new value assigned to b 
    }

}