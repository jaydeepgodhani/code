import java.util.*;
public class SortInsertion
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
//sorting started :)
        for(i=1;i<length;i++)
        {
            j=i-1;
            temp=arr[i];
            while(j!=-1 && temp<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[++j]=temp;
        }
//sorting ended :)
        long endt = System.currentTimeMillis();

        for(i=0;i<length;i++)
            System.out.print(arr[i]+ " ");

        System.out.println("took "+(endt - startt));
    }
}