package abstractionDemo;

/*
Abstraction - Process in which we only show essential details or functionalities to user is Abstraction
Ex:- Tv remote , Man driving car
It is achieved in java with two ways Abstract classes or interface(100% abstraction achieved)
class starts with abstract keyword is abstract class
 */
abstract class AbDemo {

    //concrete or normal or instance or non static
    public void show()
    {
        System.out.println("I am concrete method");
    }
    // abstract method
    abstract void display(); // no implementations for this method we can use this method later on with overriding concept

    // we can't create object of abstract class as it is abstract which is some info is missing
    //AbDemo abd = new AbDemo();
}
