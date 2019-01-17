import java.util.*;
class dpcoin //how many types of txn possible
{
    public static void main(String args[])
    {
        int[] coins = {2,3,6};
        int n = 10;
        Arrays.sort(coins);
        int[][] mat = new int[coins.length+1][n+1];
        int i,j;
        for(i=0;i<=coins.length;i++)
            mat[i][0]=1;
        for(i=1;i<=coins.length;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(coins[i-1]>j)
                    mat[i][j]=mat[i-1][j];
                else
                    mat[i][j]=mat[i-1][j]+mat[i][j-coins[i-1]];
            }
        }
        for(i=0;i<=coins.length;i++)
        {
            for(j=0;j<=n;j++)
                System.out.print(mat[i][j]);
            System.out.println();
        }
    }
}
