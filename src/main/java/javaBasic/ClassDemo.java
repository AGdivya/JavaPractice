package javaBasic;

//A class is a user defined datatype or Blueprint from which we can create object
public class ClassDemo {
    /*
    A class contain Data members , variables (static , instance), constructor ,
    interface , Nested class , methods
     */
    public int a; //instance variable

    public static String clgName; // static variable
    public void run()
    {
        int speed;
        //  System.out.println(speed); // need to initialize local variable unless it throw compile error
        System.out.println("I am run method");
        //if we did not initialize it will bedefualt take string null value
        System.out.println("I am static variable         "+clgName);
        System.out.println("I am instance variable       "+a);
    }

    //non parametrized constructor
    ClassDemo()
    {
        System.out.println("I am non parametrized constructor");
    }
    // parametrized constructor
    ClassDemo(int age)
    {
        System.out.println("I am parameterized constructor      "+age);
    }

    public  static void main(String args[])
    {
        /*
        here cd is reference variable of Class ClassDemo
        and ClassDemo() constructor call
         */
        ClassDemo cd = new ClassDemo(); //non parameterized constructor call
        System.out.println(cd.a); //default value of integer i.e 0
        //string default value i.e null
        System.out.println(clgName); //we can directly call static variable without creating object
        cd.run();
        ClassDemo cd1 = new ClassDemo(10); //parameterized constructor call
    }
}
