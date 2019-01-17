import java.util.*;
class dplis
{
    public static void main(String args[])
    {
        int[] set2 = {9,1,3,7,5,6,20};
        int[] set1 = {9,1,3,7,5,6,20};
        Arrays.sort(set1);
        int[][] mat = new int[set1.length+1][set1.length+1];
        int i,j=0;
        for(i=0;i<set1.length;i++)
        {
            mat[i][j]=0;
            mat[0][j+i]=0;
        } 
        for(i=1;i<=set1.length;i++)
        {
            for(j=1;j<=set1.length;j++)
            {
                mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
                if(set1[i-1]==set2[j-1])
                    mat[i][j]++;
            }
        }
        for(i=0;i<=set1.length;i++)
        {
            for(j=0;j<=set1.length;j++)
                System.out.print(mat[i][j]);
            System.out.println();
        }
        i=set1.length;
        j=i;
        while(i!=0 && j!=0)
        {
            if(mat[i][j]==mat[i-1][j])
                i--;
            else if(mat[i][j]==mat[i][j-1])
                j--;
            else
            {
                System.out.print(set1[i-1]+" ");
                i--;j--;
            }
        }
    }
}
