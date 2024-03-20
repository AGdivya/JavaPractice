package abstractionDemo;

public class AbstractTest {
    public static void main(String[] args)
    {
     // Animal a = new Animal(); // can't create object of Abstract method
        Dog d = new Dog("oscar");
        System.out.println("Dog name is :   "+d.getName());
        d.makeSound();
        Cat c = new Cat("smiley");
        System.out.println("Cat name is :   "+c.getName());
        c.makeSound();
    }
}