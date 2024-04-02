package coding;

public class ReverseString {
    public static void main(String[] args)
    {
        String str = "hello";

        // output olleh
         /*
     1.using toCharArray() method provided by String class (immutable)
     2.using charAt(int index) method provided by String class
     3.using reverse() method provided by java.lag.StringBuffer class
     4.using reverse() method provided by java.lag.StringBuilder class
     */
        //Approach 1
        int length = str.length();
        System.out.println("length of given String:     "+length);
        //convert string into Array
        char[] chr=str.toCharArray();
        System.out.print("Reverse of String using toCharArray method:    ");
        for(int i= chr.length-1 ;i>=0;i--)
        {
            System.out.print(chr[i]);
        }

        System.out.println();

        //Approach 2
        System.out.print("Reverse of String using charAt method:    ");
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

        System.out.println();
        //Approach 3
        System.out.print("Reverse of String using StringBuffer method:    ");
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println();
        //Approach 4
        System.out.print("Reverse of String using StringBuilder method:    ");
        StringBuilder sbd = new StringBuilder(str);
        System.out.println(sbd.reverse());

    }
}
