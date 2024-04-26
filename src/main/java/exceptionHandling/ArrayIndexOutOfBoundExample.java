package exceptionHandling;

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int[] a = new int[3];
        System.out.println(a.length);
        try {
            a[0] = 10;
            a[1] = 30;
            a[2] = 40;
            a[3] = 60; //Exception occur here as we are assigning value more than size
            System.out.println(a[0] + " " + a[1] + " " + a[2]); // here it will work when we resolve exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace(); //it will print entire exception details
            System.out.println("Message is : " + e.getMessage()); // it will only print exception message details
        }

        //System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]); this statement don't run as it is out of try block
    }
}
