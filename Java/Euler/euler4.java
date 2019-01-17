import java.util.*;
class euler4//largest palindrom by multiplying two 3digit number
{
    public static void main(String args[])
    {
        int i=0,j=0;
        long max=0L,mul=0;
        for(i=999;i>100;i--)
        {
            for(j=999;j>100;j--)
            {
                mul = i*j;
                if(ispalindrom(mul) && mul > max)
                {
                    max = i*j;
                    System.out.println(max+" "+i+" "+j);
                }
            }
        }
    }
    static boolean ispalindrom(long mul)
    {
        String s = Long.toString(mul);
        String s1 = new StringBuffer(s).reverse().toString();
        if(s.equals(s1))
            return true;
        return false;
    }
}