package javaBasic;

public class StudentDemo {
    // data member (also instance variable)
    int id;
    // data member (also instance variable)
    String name;

    public static void main(String[] args)
            /* why we write above line
            public - JVM can execute method from anywhere
            static - main method is to be called without an object
            also order of static public or public static doesn't matter
            void - doesn't return anything
            main - staring point for any java application also name "main" is configured in JVM
            String args[] -  accepts a single argument i.e an array of element of type String
             */
    {
        // creating an object of
        // Student
        StudentDemo s1 = new StudentDemo();
        System.out.println(s1.id); //0
        System.out.println(s1.name); //null
    }

}
