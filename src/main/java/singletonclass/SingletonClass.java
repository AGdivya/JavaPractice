package singletonclass;

public class SingletonClass {
    /*
    A Singleton class is a class that allows only one instance of itself to be created and provides a global point of access to that instance.
     */
    // 1.Declare a private static variable to hold the single instance of the class.
    private static SingletonClass single_instance = null;

    String s;
    // 2. Make the constructor of the class private, so that no other instances can be created.

    private SingletonClass()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // 3.Provide a public static method to return the single instance of the class, creating it if necessary.
    public static SingletonClass getInstance()
    {
        if (single_instance == null)
        {
            single_instance = new SingletonClass();
        }
        return single_instance;
    }
}
