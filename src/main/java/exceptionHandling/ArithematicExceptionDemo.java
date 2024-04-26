package exceptionHandling;


public class ArithematicExceptionDemo {

    public static void show() {
        System.out.println("I am show method");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            // Method of Throwable class
            System.out.println("Using printStackTrace method we can print name,description and location of exception");
            ae.printStackTrace();
            System.out.println("Using getMessage method we can print just description of exception:" + ae.getMessage());
            System.out.println("Using toString method we can get the name and description: "+ae.toString());

        }
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        show();
    }

}
