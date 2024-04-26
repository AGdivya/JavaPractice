package coding;

import java.util.*;

class Factorial {

    public static int FirstFactorial(int num) {
        // code goes here
        int result = 1;
        while(num>=1)
        {
            result = result * num ;
            num--;
        }
       // System.out.println(result);
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

}