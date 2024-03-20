package overriding;

public class OverRidingTest {

    public static void main(String[] args)
    {
        System.out.println("Calling functions using parent class object");
        //Using parent class object, we can call all the methods of child class but no method of child class
        A a = new A();
        a.m1(); //A class m1 method
        a.m2(); //A class m2 method
        a.m3(); //A class m3 method
        a.m4(); //A class m4 method

        //compile time error when we call child class methods from parent class object
//        a.m5();
//        a.m6();

        System.out.println("Calling functions using child class object");
        //Using child class object, we can call all the methods of parent class and child  class
        B b = new B();
        b.m1(); //B class m1 method
        b.m2(); //B class m2 method
        b.m3(); //A class m3 method
        b.m4(); //A class m4 method
        b.m5(); //B class m5 method
        b.m6(); //B class m6 method

        System.out.println("Calling functions using parent class reference but child class object");
        A a1=new B();
        a1.m1(); //B class m1 method
        a1.m2(); //B class m2 method
        a1.m3(); //A class m3 method
        a1.m4(); //A class m4 method

        //compile time error when we call child class method from parent class reference variable
        //because there is no space in PArent class to store those methods
//        a1.m5();
//        a1.m6();

    }
}
