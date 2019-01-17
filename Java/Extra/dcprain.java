import java.util.*;
class dcprain
{
    public static void main(String ar[])
    {
        int[] height = {3,0,1,3,0,5};
        int i=0,j=0,count=0;
        while(j<height.length)
        {
            j++;
            while(j<height.length-1 && height[j]<=height[i])
            {
                count+=height[i]-height[j];
                j++;
            }
            i=j;
        }
        System.out.println(count);

    }
}
