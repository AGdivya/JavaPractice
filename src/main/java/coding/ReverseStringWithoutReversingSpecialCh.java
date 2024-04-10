package coding;

import java.util.Scanner;

public class ReverseStringWithoutReversingSpecialCh {
    /*
    input String = "di%^v&y@@a!"
    output String = "ay%^v&1@@d
     */
    public static void main(String[] args) {

        String output = reverseString();
        System.out.println("String Reverse output is:   "+output);
    }

    public static String reverseString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        char[] chr = str.toCharArray();
        int left = 0;
        int right = chr.length - 1;

        while (left < right) {
            if (!Character.isLetter(chr[left])) {
                left++;
            } else if (!Character.isLetter(chr[right])) {
                right--;
            }
            else
            //swap alphabets
            {
                char temp = chr[left];
                chr[left] = chr[right];
                chr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chr);
    }
}
