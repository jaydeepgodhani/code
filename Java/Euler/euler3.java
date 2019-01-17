import java.util.*;
class euler3
{
    public static void main(String args[])
    {
        long input = 600851475143L,max=0,flag=1,start;
        for(start=2;start<=input;start++)
        {
            //while(input!=1)
            flag=1;
                for(long i=2;i<=Math.sqrt(start);i++)
                {
                    if(start%i==0)
                        flag=0;
                }
                if(flag==1)
                {
                    if(input%start==0)
                    {
                        input/=start;
                        if(start>max)
                            max=start;
                    }
                }
        }
        System.out.println(max);
    }    
}