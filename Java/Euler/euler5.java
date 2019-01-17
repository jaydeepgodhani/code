import java.util.*;
class euler5
{
    public static void main(String args[])
    {
        long i=20L;
        int flag=0,loop=0;
        while(flag!=1)
        {
            for(loop=20;loop>=2;loop--)
            {
                if(i%loop!=0)
                {
                    i+=20;
                    break;
                }
                else
                {
                    if(loop == 2)
                        flag = 1;   
                }
            }
        }
        System.out.println(i);
    }    
}