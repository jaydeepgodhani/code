import java.util.*;
public class bubblesort
{
    public static void main(String args[])
    {
        int arr[]=new int[100];
        int i=0,j=0,length=arr.length,temp;
        Random rnd = new Random();

        for(i=0;i<length;i++)
            arr[i]=rnd.nextInt(length);

        for(i=0;i<length;i++)
            System.out.print(arr[i]+ " ");
     
        System.out.println();
        long startt = System.currentTimeMillis();

        for(i=0;i<length-1;i++)
        {
            for(j=0;j<length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(i=0;i<length;i++)
            System.out.print(arr[i]+ " ");
        
        long endt = System.currentTimeMillis();
        System.out.println("took "+(endt - startt));
    }
}