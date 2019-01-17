import java.util.*;
public class atm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float x,y;
        x = sc.nextFloat();
        y = sc.nextFloat();
        if(x%5 == 0 && x+0.5 <= y)
        {
            y = y - x - 0.5f;
            System.out.println(y);
        }
        else
            System.out.println(y);
    }
}