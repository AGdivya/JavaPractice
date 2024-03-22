package overloading;

public class AdditionWithOverloading {

    public void add(int a , int b)
    {
        int total = a + b;
        System.out.println("Two parameters method:  "+total);
    }

    //method overloading by increasing number of argument
    public void add(int a , int b , int c)
    {
        int total = a +b +c ;
        System.out.println("Three parameters method:    "+total);
    }

    //method overloading by changing argument type
    public void add(int a , double b)
    {
        double total = a +b;
        System.out.println("Two different parameters method:    "+total);
    }

    //method overloading by changing order of argument type
    public void add(double a , int b)
    {
        double total = a +b;
        System.out.println("Two different parameters method with order change:    "+total);
    }
}
