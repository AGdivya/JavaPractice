package overloading;

public class AdditionUsingVarArgs {
    int total,a ,b;

    public void add(int ... a)
    {
        System.out.println("Argument length:    " +a.length);
        total=0;
        for (int i:a)
        {
            total+=i;
        }
        System.out.println("Sum of all integers=    " + total);
    }

    public void add(double d,int ... a)
    {
        System.out.println("Argument length:    " +a.length);
        double total=0;
        for (int i:a)
        {
            total+=d+i;
        }
        System.out.println("Sum of all integers=    " + total);
    }

    public void add(int a,int b)
    {
        total=0;
        total=a+b;
        System.out.println("Sum of two integers=    " + total);
    }
}
