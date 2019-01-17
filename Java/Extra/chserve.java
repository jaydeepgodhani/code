import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class chserve
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        String[] str = new String[3];
        long a,b,c;
        long temp;
        for(int i=0; i<test ; i++)
        {
            str = br.readLine().split(" ");
            a = Long.parseLong(str[0]);
            b = Long.parseLong(str[1]);
            c = Long.parseLong(str[2]);
            temp = (a+b)/c;
            if(temp%2==0)
                System.out.println("CHEF");
            else
                System.out.println("COOK");
        }
    }
}