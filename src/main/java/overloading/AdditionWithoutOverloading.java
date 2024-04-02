package overloading;

public class AdditionWithoutOverloading {

    int total;

    public void addTwoNo(int a, int b)
    {
        total = a +b ;
        System.out.println("Sum of two numbers:     "+total);
    }

    public void addThreeNo(int a, int b, int c)
    {
        total = a + b + c ;
        System.out.println("Sum of three numbers:     "+total);
    }

    public void addFourNo(int a, int b , int c , int d)
    {
        total = a + b + c +d;
        System.out.println("Sum of four numbers:     "+total);
    }
}
