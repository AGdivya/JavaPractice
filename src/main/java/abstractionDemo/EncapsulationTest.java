package abstractionDemo;

public class EncapsulationTest
{
    public static void main(String[] args)
    {
        EncapsulationDemo ed = new EncapsulationDemo();
        /*
        we can't directly access variable if we had declared them as private
        so we need to create getter and setters for those variable
         */
        ed.setName("divya");
        System.out.println("My name is :    "+ed.getName());

        System.out.println(ed.getAge()); // here we don't set value it will print default value of Integer

        ed.setClgName("CDGI");
        System.out.println(ed.getName()+ "  college name is:    "+ed.getClgName());
    }
}
