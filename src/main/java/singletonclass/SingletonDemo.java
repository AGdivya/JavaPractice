package singletonclass;

public class SingletonDemo {

    public static void main(String[] args)
    {
      //  SingletonClass sc = new SingletonClass(); as constructor is private we can't create new instance of class
        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();  //everytime it will print same value
        System.out.println(x + "" +y);

        // changing variable of instance x
        x.s = (x.s).toUpperCase();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");

        // changing variable of instance y
        y.s = (y.s).toLowerCase();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);

    }
}
