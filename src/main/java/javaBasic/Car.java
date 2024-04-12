package javaBasic;

public class Car extends Vehicle
        {
            //child class for super keyword demo
            public int maxSpeed = 180;

            //child class constructor
            public Car()
            {
                super();
                System.out.println("I am child class constructor");
               // super(); //super must be first stament in method body
            }
            public int display()
            {
                return super.maxSpeed;
            }
        }
