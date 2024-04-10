package coding;

public class IntegerReverse {

    public static  void main(String[] args)
    {
        int originalNumber = 1000;
        System.out.println(revInt(originalNumber));

    }

    public static int revInt(int originalNumber)
    {
        int reverseNumber = 0;
        int remainder;
        while(originalNumber!=0)
        {
            remainder = originalNumber%10;
            originalNumber = originalNumber/10;
            reverseNumber = reverseNumber*10 + remainder;
        }

        return reverseNumber;
    }
}
