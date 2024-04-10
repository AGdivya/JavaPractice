package coding;

public class ReverseStringOddWord {
    /*
    program
        string str = "This is my school"
        output = "This si my loohcs"
     */
    public static void main(String[] args) {
        String str = "This is my school";
        String output = reverse(str);
        System.out.println(output);
    }

    //using string builder class
    static StringBuilder reverseString(String s) {
        // s=this 0 t 1 h 2 i 3 s
        //length = 4
        //siht
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray(); //ch[] = {t, h, i, s}
        for (int i = ch.length - 1; i >= 0; i--) //i=3 //i=2
        {
            sb.append(ch[i]); //siht
        }
        return sb;
    }

    //using string class
    static String reverseStr(String s) {
        // s=this 0 t 1 h 2 i 3 s
        //length = 4
        //siht
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) //i=3 //i=2
        {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static String reverse(String str) {
        String[] a = str.split(" "); // ["This", "is", "my", "School"]

        for (int i = 0; i < a.length; i++) //i=0
        {

            String result = a[i]; //This
            if (i % 2 != 0) { // odd
                //   result = String.valueOf(reverseString(a[i])); // loohsc
                result = reverseStr(a[i]);
            }
            System.out.println(result + " "); // This si my loohsc
        }

        return str;
    }
}
