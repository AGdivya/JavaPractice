package javaBasic;
public class SIB_IIB {

    /*
    if we have static block , instance block , constructor and method call
    order of execution of them as
    static --> instance - constructor - method
     */
    int a=10; //instance variable
    static int b=20; //static variable

    //Constructor
    public SIB_IIB() {
        System.out.println("Inside Constructor"); //3
    }

    //Static Block
    static {
        //static int x; can't use static keyword inside static block
        int a=20; //local variable
        SIB_IIB s = new SIB_IIB();
        s.a= 30;
        b=100;
        System.out.println("Inside static Block");  //1
    }

    //Instance Block
    {
        //static int x;
        int a = 30;
        int b = 40;
        System.out.println("Inside instance Block"); //2
    }

    public void show()
    {
        System.out.println("Show method");
    }
    public static void main(String[] args) {
        SIB_IIB s1=new SIB_IIB();
        s1.show(); //rather we are calling this method here but before this static block execute
        System.out.println("Value of b is:  "+s1.b); // here we can directly call static variable without using class name //4
        System.out.println("Value of a is:  "+s1.a);
        SIB_IIB s=new SIB_IIB();
        s.a=30;
        System.out.println("Value of a is:  "+s.a);
        SIB_IIB s2=new SIB_IIB(); //always instance block initiate then constructor
        s2.show();

    }
}
