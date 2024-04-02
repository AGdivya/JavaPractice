package coding;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {
    public static String str = "Programming";

    public static  void main(String[] args)
    {
        //Using toCharArray() method
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for(int i=0 ;i< arr.length;i++)   //i=0
        {
            boolean repeated = false;
           for(int j=i+1;j<arr.length;j++) //j=1
           {
               if(arr[i]==arr[j])
               {
                    repeated = true;
                    break;
               }
           }
           if(!repeated)
           {
               sb.append(arr[i]);
           }
        }
        System.out.println(sb);

        //Using java 8 stream
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char)c));
        System.out.println(sb1);

        //Using indexOf() method
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<str.length() ;i++)
        {
            char ch = str.charAt(i);
            int index =str.indexOf(ch,i+1);
           // System.out.println(index);
            if(index==-1)
            {
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

        //Using set interface
        StringBuilder sb3 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0 ;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        for (Character c :set)
        {
            sb3.append(c);
        }
        System.out.println(sb3);

    }


}
