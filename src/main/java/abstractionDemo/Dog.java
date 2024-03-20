package abstractionDemo;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    //implementing abstract method of Animal class
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

