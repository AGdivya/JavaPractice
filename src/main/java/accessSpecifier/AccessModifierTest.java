package accessSpecifier;

public class AccessModifierTest
{
    public static void main(String[] args)
    {
        AccessModifier a = new AccessModifier();
        a.display(); // with in same package we can access default modifier
       // a.age;
        AccessModifierChild ac = new AccessModifierChild();
        ac.display();       //default access modifier
        ac.show();          //public access modifier
        ac.inherit();
       // ac.clgName;         // private variable not accessible outside package
    }
}
