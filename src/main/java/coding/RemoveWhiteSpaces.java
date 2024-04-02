package coding;

public class RemoveWhiteSpaces {
    public static void main(String[] args)
    {
        String str = "  My name is divya  ";
        //Mynameisdivya
        //using trim method in java - it will remove only beginning and ending spaces
        String trimmedStr = str.trim();
        System.out.println("My trimmed Str is: "+trimmedStr);

        //using replaceAll() method
        String str1 = str.replaceAll("[\\s]","");
        System.out.println("string after white spaces removed: "+str1);

        //using replace method
        String str2 = str.replace(" ","");
        System.out.println("string after white spaces removed using replace method:" +str2);

        //using java8 streams

    }
}
