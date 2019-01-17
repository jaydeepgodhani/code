import java.util.*;
class dpwordwrap
{
    public static void main(String args[])
    {
        String s = "thequickbrown foxjumps over the lazy dog";
        int k =16;
        String input[]=s.split("\\s");//\\s is for any whitespace but (" ") also works fine
        String ss1;
        int i,j=0,count=0,temp=0,z=0,space=0,remain=0,q=0,h=0;
        for(i=0;i<input.length;i++)
        {
            count = input[i].length();
            j++;
            while(i+1<input.length && count+input[i+1].length() < k )
            {
                count+=input[++i].length()+1;
                j++;
            }
            if(j==1)
            {
                temp=k-count;
                while(z++ < temp)
                    System.out.print(" ");    
                System.out.print(input[q++]+"\n");
                h++;
            }
            else
            {
                System.out.print(input[q++]);
                h++;
                temp = k-count+(j-1);
                remain = temp%(j-1);
                space = temp/(j-1);
                while(remain>0)
                {
                    System.out.print(" ");
                    int w=0;
                    while(w++<space)
                        System.out.print(" ");
                    System.out.print(input[q++]);
                    h++;
                    remain--;
                }
                while(h<j)
                {
                    int w=0;
                    while(w++<space)
                        System.out.print(" ");
                    System.out.print(input[q++]);
                    h++;
                }
                System.out.println();
            }
            count=0;j=0;h=0;
        }
    }
}
