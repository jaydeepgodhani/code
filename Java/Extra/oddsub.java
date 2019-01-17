import java.util.*;

public class oddsub {
    public static void main(String arrgs[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int size = sc.nextInt();
            int counter = 0;
            int sum=0;
            int a[]= new int[size];
            for(int j=0;j<size;j++)
            {
                if(sc.nextInt() % 2 ==0)
                    a[j]=0;
                else
                    a[j]=1;
            }
            for(int k=0;k<size;k++)
            {
                sum=0;
                for(int l=k;l<size;l++)
                {
                    sum+=a[l];
                    if(sum % 2 == 1)
                        counter++;
                }   
            }
            System.out.println(counter);
        }
    }
}