package exceptionHandling;

public class ThrowDemo {

    /*
   Throw keyword is used to explicitly create an object of Exception class and
       provide it to JVM to handle it
        throw new ArithematicException("/ by zero");
        It has to be used with customizes/user-defined exceptions

     */
    static int amount = 1000;
    static int balance = 200;

    public static void main(String[] args) {
        if (amount > balance) {
            throw new InSufficientBalanceException();
        }
        else
        {
            int newBal = balance-amount;
            System.out.println(newBal);
        }
    }

}
