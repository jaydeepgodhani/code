import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class codechef {
    public static void main(String arrgs[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int time = 0,ans=0,temp=0;
        for(int i=0;i<test;i++)
        {
            time = sc.nextInt();
            ans = time/26;
            temp = ans * 26;
            if(time>=0)
            {
                if(time <= temp+2 && time%26 != 0)
                    System.out.printf("%d 0 0\n",(long)Math.pow(2, ans));
                else if(time>temp+2 && time<=temp+10)
                    System.out.printf("0 %d 0\n",(long)Math.pow(2, ans));
                else if(time>temp+10)
                    System.out.printf("0 0 %d\n",(long)Math.pow(2, ans));
                else
                    System.out.printf("0 0 %d\n",(long)Math.pow(2, ans-1));
            }
        }
    }
}