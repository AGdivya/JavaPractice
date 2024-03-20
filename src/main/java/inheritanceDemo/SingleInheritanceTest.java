package inheritanceDemo;

public class SingleInheritanceTest {
    public static void main(String[] args)
    {
        //creating object of Parent class with parent reference variable
        ClassA a = new ClassA();
        a.display();    //I am parent Class
        a.read();       //I can read
        //creating object of Child class with child reference variable
        ClassB b = new ClassB();
        b.display();
        b.read();
        //creating object of Child class with parent reference variable
        ClassA a1 = new ClassB();
        a1.display();   //I am child Class overriding happen
        a1.read();      //I can read

      //  a1.write(); // we can't call child class method from Parent reference variable

        //creating object of Parent class with child reference variable
        //ClassB b1 = new ClassA(); //It will throw compile time error
    }
}
