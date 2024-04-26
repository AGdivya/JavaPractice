package exceptionHandling;

public class TryCatchFinallyDemo {

    public static void main(String[] args)
    {
        show();
    }

    public static void show()
    {
        try {
            System.out.println(10 / 0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            //System.exit(0); //if we write this line then finally block will not exit because we are stopping process here only
        }
        finally {
            System.out.println("I am finally block"); //this will execute wether exception occur or not
        }

    }
}
