import java.util.*;

import javax.lang.model.util.ElementScanner6;
class findrank
{
    public static void main(String args[])
    {
        int[] ar = {10,12,15,12,10,25,13};
        int[] ar2 = {10,12,15,12,10,25,13};
        int[] ans = new int[ar.length];
        Arrays.sort(ar2);
        int i,j;
        for(i=0;i<ar.length;i++)//we can do binary search here for better performance
        {
            j=0;
            while(ar[i]!=ar2[j])
            {
                j++;
            }
            ans[i]=j+1;
        }
        for(i=0;i<ar.length;i++)
            System.out.print(ans[i]+" ");
        int rank = 3;
        int pivot = 15;
        System.out.println(findRankOfElement(pivot,ar));
        System.out.println(findElementOfRank(rank,ar,0,ar.length-1));
    }
    static int findRankOfElement(int pivot,int[] ar)
    {
        int i=0,rank=1;
        while(i<ar.length)
        {
            if(ar[i++]<pivot)
                rank++;
        }
        return rank;
    }
    static int findElementOfRank(int rank,int[] ar, int start, int stop)
    {
        int pivot=ar[start], elm, count=1, temp=start+1,i;
        if(rank < 0 || rank > ar.length)
        {
            return -1;
        }
        /*else
        {
            for(i=start+1;i<=stop;i++)
            {
                if(ar[i]<=pivot)
                {
                    elm = ar[i];
                    ar[i] = ar[temp];
                    ar[temp] = elm;
                    temp++;
                    count++;
                }
                elm = ar[temp-1];
                ar[temp-1] = ar[start];
                ar[start] = elm;
            }
            for(i=0;i<ar.length;i++)
                    System.out.print(ar[i]+" ");
                System.out.println();
                if(rank == temp-1)
                    return ar[temp-1];
                else if(rank < temp-1)
                    return findElementOfRank(rank, ar, start, temp-2);
                else
                    return findElementOfRank(rank-temp-2, ar, temp, stop);
        }*/
    }
}