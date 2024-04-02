package coding;

public class RemoveSpecialChar {
    public static void main(String[] args)
    {
        String str = "$ja!va$&st%a#r(*";

        //Approach 1 using replaceAll() method
        String plainStr =str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Plain string is :   "+plainStr);

    }
}
