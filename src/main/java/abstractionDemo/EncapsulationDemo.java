package abstractionDemo;

public class EncapsulationDemo {
   /*
   Wrapping of data into single unit is called Encapsulation.
   To achieve encapsulation we declare instance variable as private and then we can use them by getter and setters
   in another class
    */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String clgName;
    private int age;

}

