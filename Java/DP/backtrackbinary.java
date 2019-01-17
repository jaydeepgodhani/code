import java.util.*;
public class backtrackbinary
{
    public static void main(String args[])
    {
        System.out.println("How many digit you want in binary");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        bin(a,n);
    }
    static void bin(int[] a, int n)
    {
        if(n==0)
        {
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]);
            System.out.println();
        }
        else
        {
            a[n-1]=0;
            bin(a,n-1);
            a[n-1]=1;
            bin(a,n-1);
        }
    }
}