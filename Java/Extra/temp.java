import java.util.*;
class temp
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int tp = 4 - (m%4);
        int tl = n%4;
        int g=m+tp;
        int h=n-tl;
        int times = (h-g)/4;
        
        System.out.println(m+tp);
        System.out.println(n-tl);
        if(h!=n)
            times +=1;
        System.out.println(times);
    }
}