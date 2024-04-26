package coding;

import javax.swing.*;

public class CheckStringPalindrom {

    public static void main(String[] args)
    {
        String str= "ABBA";

        int length = str.length();
        int j = length-1;
        int i=0;
        for(i=0;i<j;i++)
        {
          if(str.charAt(i)!=str.charAt(j))
          {
              if(str.charAt(i+1)==str.charAt(j))
              {
                  System.out.println(str.charAt(i));
                  break;
              }
              else if(str.charAt(i)==str.charAt(j-1))
              {
                  System.out.println(str.charAt(j));
                  break;
              }
          }
       j--;
        }
        if(i==j||j<i)
        System.out.println("string is already palindrom");
    }
    }

