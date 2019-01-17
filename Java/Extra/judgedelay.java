import java.util.*;
class judgedelay
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int x,y,count;
        int[] a=new int[tests];
        for(int i=0; i<tests; i++)
        {
            int times = sc.nextInt();
            count=0;
            for(int j=0; j<times; j++)
            {
                x = sc.nextInt();
                y = sc.nextInt();
                if(y-x>5)
                    count++;
            }
            a[i]=count;
        }
        for(int i=0; i<tests; i++)
        {
            System.out.println(a[i]);
        }
    }
}