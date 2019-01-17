import java.util.*;
class euler7
{
    public static void main(String args[])
    {
        int count = 1,j;
        long i=2L;
        while(count < 10001)
        {
            i++;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    break;
                else
                {
                    if(j==i-1)
                        count++;
                }
            }
        }
        System.out.println(i);   
    }
}