package coding;

import java.util.HashMap;

public class StringCountUsingHashMap {
    static String str = "adadegfghg";
    //output = a2d2e1g3f1h1
    /*
    take str as an array --> create a hashmap and add elements into hashmap --> find frequency of each key in hashmap
    print key with its frequency value
     */

    public static  void main(String[] args)
    {
        System.out.println(stringCount(str));
    }

    public static StringBuilder stringCount(String str)
    {
//        char[] chr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for( i=0 ;i<str.length()-1;i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
           else
            {
                map.put(str.charAt(i),1);
            }
        }
        for (int key : map.keySet()) {
            sb.append(key).append(map.get(key));
        }

        return sb;
    }
}
