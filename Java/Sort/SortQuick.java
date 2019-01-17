import java.util.*;

public class SortQuick {

    static int partpart(int ar[],int m,int n)
    {
        int pivot = ar[n];
        int i = m-1;
        for (int j=m; j<n; j++)
        {
            if (ar[j] <= pivot)
            {
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        int temp = ar[i+1]; 
        ar[i+1] = ar[n]; 
        ar[n] = temp; 
        return i+1;
    }
    static void quicksort(int ar[],int i, int j){
        if(i<j)
        {
            int mid = partpart(ar,i,j);
            quicksort(ar, i, mid-1);
            quicksort(ar, mid+1, j);
        }
    }

    public static void main(String args[]) {
        int ar[] = new int[10];
        int i = 0, j = 0, length = ar.length, temp, var;
        Random rnd = new Random();

        for (i = 0; i < length; i++)
            ar[i] = rnd.nextInt(length);

        for (i = 0; i < length; i++)
            System.out.print(ar[i] + " ");

        System.out.println();
        long startt = System.currentTimeMillis();
        // ****************************************** sorting started :)
        quicksort(ar,0,length-1);
        // ****************************************** sorting ended :)
        long endt = System.currentTimeMillis();

        for (i = 0; i < length; i++)
            System.out.print(ar[i] + " ");

        System.out.println("took " + (endt - startt));
    }
}