package javaBasic;

import static javaBasic.Child.display;

public class StaticDemo {

    public static void main(String[] args) {

        //This not method overriding. It is method hiding

        Child c= new Child();
        display(); // child display method call here ---  I am Child class static method
        c.show(); // child class show method  --- I am Child class non-static method

        Parent p=new Parent();
        p.display(); // parent class display method call here --- I am Parent class static method

        Parent p1=new Child();
        p1.display();//parent class display method call here --- I am Parent class static method
        p1.show(); //I am Child class non-static method - because show method is overridden in Child class

    }

}