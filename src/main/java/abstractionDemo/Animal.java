package abstractionDemo;

// Abstract Class declared
abstract class Animal {
    private String name;

  //parametrized constructor
    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound(); //abstract method here we are just creating template implementations is not done

    public String getName() {
        return name;
    }
}
