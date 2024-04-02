package accessSpecifier;

public class AccessModifier {

    private String clgName="CDGI";
    protected int age = 4;
    void display()
    {
        System.out.println("I am default access modifier method");
        System.out.println("I am private variable:  "+clgName);
    }

    public void show()
    {
        System.out.println("I am public access modifier method");
    }

    protected void read()
    {
        System.out.println("I am protected modifier method");
        System.out.println("My age is : "+age);
    }

}
