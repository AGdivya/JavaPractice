package abstractionDemo;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    //implementing abstract method of Animal class
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}
