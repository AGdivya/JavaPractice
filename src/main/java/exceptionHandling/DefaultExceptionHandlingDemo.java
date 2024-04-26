package exceptionHandling;


public class DefaultExceptionHandlingDemo {

    public void m1() {
        System.out.println("Inside m1");
        System.out.println(10 / 0);  //array index out of bound Exception
    }

    public void m2() {
        try {
            System.out.println("Inside m2");
            m1();
            System.out.println("Exception occured in previous line"); // This wont print
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("After calling m1");// This will print if this is written after try-catch
    }

    public void m3() {

        System.out.println("Inside m3");
        m2();
    }

    public static void main(String[] args) {

        DefaultExceptionHandlingDemo d = new DefaultExceptionHandlingDemo();
        System.out.println("Inside main");
        d.m3();

    }

    // m1() method - inside which exception occurs has the responsibility is to:
    // 1) create exception object
    // 2) Hand it over to the JVM
    // 3) Now JVM checks if m1() has a try-catch block to handle that exception
    // 4) If not, JVM removes m1() from stack and checks who called m1()
    // 5) Now JVM checks m2() and checks if it has try-catch to handle exception
    // 6) If not, JVM removes m2() from stack and checks who called m2()
    // 5) Now JVM checks m3() and checks if it has try-catch to handle exception
    // 6) If not, JVM removes m3() from stack and checks who called m3()
    // 7) Now JVM checks who called m3() - MAIN method
    // 8) If not handled in main() also, the JVM gives the exception to the JAVA's
    // default exception handler
    // 9) The default exception handler uses the printStackTrace method to directly
    // print the exception
}
