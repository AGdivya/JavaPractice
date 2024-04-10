package coding;

public class StringCount{

    /*
    i/p: 112233441112235
     o/p: 1222324213223151
     */
    public static void main(String[] args)
    {
        String str ="112233441112235";
        String output = test(str);
        System.out.println(output);
    }

    public static String test(String str)
    {
        int count =1;
        char [] chr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chr.length-1;i++)
        {
            if(chr[i]==chr[i+1])
            {
                count++;
            }
            else
            {
                sb.append(chr[i]);
                sb.append(count);
                count=1;
            }
        }
        sb.append(chr[chr.length-1]);
        sb.append(count);

        return new String(sb);
    }
}
