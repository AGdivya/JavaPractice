package exceptionHandling;

public class InSufficientBalanceException extends RuntimeException {

    public void inSufficientBalanceException()
    {
        System.out.println("you have less balance than withdrawal limit");
    }

    @Override
    public void printStackTrace()
    {
        System.out.println("insufficient balance");
    }
}
