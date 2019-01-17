import java.util.*;
class dcpwordcount
{
    public static void main(String a[])
    {
        String s = "AAAABBBCDDDDEE";
        int i=0,count=1;
        char ch;
        while(i<s.length())
        {
            ch = s.charAt(i);
            while(++i<s.length() && ch == s.charAt(i))
                count++;
            System.out.print(s.charAt(i-1)+""+count);
            count=1;
        }
    }
}
