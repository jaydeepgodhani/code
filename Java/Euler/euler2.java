import java.util.*;
class euler3
{
    public static void main(String args[])
    {
        long a=1,b=2,c,sum;
        c=a+b;
        sum=b;
        while(c<4000000)
        {
            c = a+b;
            if(c%2==0)
                sum+=c;
            a=b;
            b=c;
        }
        System.out.println(sum);
    }    
}