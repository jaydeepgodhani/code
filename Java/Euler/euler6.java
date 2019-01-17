import java.util.*;
class euler6
{
    public static void main(String args[])
    {
        long i=0L,sum1=0L,sum2=0L;
        for(i=1;i<=100;i++)
        {
            sum1 += (i*i);
            sum2 += i;
        }
        sum2 = sum2* sum2;
        System.out.println(sum2-sum1);        
    }
}