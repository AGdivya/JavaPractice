package accessSpecifier;

public class AccessModifierChild extends AccessModifier{
    public void inherit()
    {
        System.out.println("My age in child class is : "+age); //protected variable are accessible from child class
    }



}
