import java.util.*;
public class factcode
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long[] ar = new long[100];
        ar[0]=1;
        int x = sc.nextInt(),y,count=0;
        long[] ans = new long[x];
        for(int i=0;i<x;i++)
        {
            y=sc.nextInt();
            if(y-1<=count)
                ans[i]=ar[y-1];
            else
            {
                while(count<y-1)
                {
                    ar[count+1]= ar[count]*(count+2);
                    count++;
                }
                ans[i]=ar[count];
            }
        }
        for(int i=0;i<x;i++)
        {
            System.out.println(ans[i]);
        }
    }
}