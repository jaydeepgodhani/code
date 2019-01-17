import java.util.*;
class dpsubset
{
    public static void main(String args[])
    {
        int[] set={3,34,4,12,5,2};
        int sum = 9;
        Arrays.sort(set);
        boolean[][] mat = new boolean[set.length+1][sum+1];
        int i,j;
        for(i=0;i<=set.length;i++)
            mat[i][0]= Boolean.TRUE;
        for(i=0;i<=set.length;i++)
        {
            for(j=1;j<=sum;j++)
            {
                if(i==0)
                    mat[0][j]=Boolean.FALSE;
                else
                {
                    if(set[i-1]>j)
                        mat[i][j]=mat[i-1][j];
                    else
                        mat[i][j]=mat[i-1][j] || mat[i-1][j-set[i-1]];
                }
            }
        }
        for(i=0;i<=set.length;i++)
        {
            for(j=0;j<sum+1;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        i=set.length;
        j=sum;
        while(i!=0 && j!=0)
        {
            if(mat[i-1][j]==true)
                i--;
            else
            {
                System.out.print(set[i-1]+" ");
                j=j-set[i-1];
            }
        }
    }
}