package javaBasic;

public class SuperKeywordDemo {

    public static void main(String[] args)
    {
      Vehicle v = new Vehicle();
        System.out.println("Speed of Vehicle:   "+v.maxSpeed); //print maxspeed of vehicle class

        Car c = new Car();
        System.out.println("speed of Car    "+c.maxSpeed); //print max speed of car

        System.out.println("using super keyword in method call of child method:     "+c.display());
    }
}

