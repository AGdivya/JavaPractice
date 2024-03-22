package javaBasic;
import java.util.Scanner;

public class Calculator {

    int a,b; // If you do not declare these, program will run fine, but you will not be able to use a,b in main()

    //this block will execute before main method
    static {
        System.out.println("CALCULATOR"+"\n");
    }

    public void add(double a,double b)
    {
        double sum=0;
        sum=a+b;
        System.out.println("Sum of "+a +" and "+ b+" = " + sum);
    }

    public void subtract(double a,double b)
    {
        double diff=0;
        diff=a-b;
        System.out.println("Difference of " +a +" and "+ b +" = " + diff);
    }

    public void multiply(double a,double b)
    {
        double multiply=0;
        multiply=a*b;
        System.out.println("Multiplication of " +a +" and " +b+ " = " + multiply);
    }

    public void divide(double a,double b)
    {
        double division=0;
        division=a/b;
        System.out.println("Division of " + a + " by " + b + " = " + division);
    }


    public static void main(String[] args) {

        Calculator c= new Calculator();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        double val1=s.nextDouble();
        System.out.println("Enter the second value: ");
        double val2=s.nextDouble();

        c.add(val1 , val2);
        c.subtract(val1 , val2);
        c.multiply(val1 , val2);
        c.divide(val1 , val2);
        // Can be called because a,b were declared as instance variables
        System.out.println(c.a); //print default value
        System.out.println(c.b); //print default value

    }

}
