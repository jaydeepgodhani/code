import java.util.*;
class dpmincoin//min number of coins required for value
{
    public static void main(String[] args)
    {
        int[] coins = {2,3,5,6};
        Arrays.sort(coins);
        int value = 10;
        int[][] mat = new int[coins.length+1][value+1];
        int i,j,MAXX=Integer.MAX_VALUE-value;
        for(i=0;i<=coins.length;i++)
        {
            for(j=0;j<=value;j++)
            {
                if(i==0)
                    mat[i][j]=MAXX;
                else if(j==0)
                    mat[i][j]=0;
                else
                {
                    if(coins[i-1]>j)
                        mat[i][j]=mat[i-1][j];
                    else
                        mat[i][j]=Math.min(1+mat[i][j-coins[i-1]],mat[i-1][j]);
                }
            }
        }
        System.out.println(mat[coins.length][value]);
    }
}
