import java.util.*;
class jan2lunchtime
{
    public static void main(String args[])
    {
        int i,j,ans=0,tp,tl,g,h,extra,years,days,temp,z,yc,mc,dc,y,m,d;
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(i=0; i<times; i++)
        {
            int input = sc.nextInt();
            int[] months = new int[input];
            for(int o=0; o<input; o++)
            {
                months[o] = sc.nextInt();
            }
            yc = sc.nextInt();
            mc = sc.nextInt();
            dc = sc.nextInt();
            y = sc.nextInt();
            m = sc.nextInt();
            d = sc.nextInt();
            if(yc == y)
            {
                if(mc == m)
                    ans = (d-dc)+1;
                else
                {
                    ans = months[mc-1]-dc+1;
                    for(z=mc; z<m-1;z++)
                        ans += months[z];
                    ans += d;
                }
            }
            else
            {
                ans = months[mc-1]-dc+1;
                temp = mc;
                while(temp<input)
                    ans += months[temp++];
                if(yc%4==0)
                    ans += 1;
                temp = 0;
                while(temp<m-1)
                    ans += months[temp++];
                ans += d;
                tp = 4 - (yc%4);
                tl = y%4;
                g=yc+tp;
                h=y-tl;
                extra = (h-g)/4;
                if(h!=y)
                    extra +=1;
                ans += extra;
                years = y - (yc+1);
                days = 0;
                temp = 0;
                while(temp < input)
                    days += months[temp++];
                ans += (years*days);
            }
            System.out.print(ans);
        }
    }
}