import java.util.*;
class dpknapsack
{
    public static void main(String args[])
    {
        int w = 5;
        int[] weight={1,2,3,4};//sort in increasing
        int[] value={40,20,100,60};//corresponding sort
        int[][] mat = new int[weight.length+1][w+1];
        int i=0,j=0;
        while(i<=w)
        {
            mat[0][i] = 0;
            i++;
        }
        i=0;
        while(i<=weight.length)
        {
            mat[i][0]=0;
            i++;
        }
        for(i=1;i<=weight.length;i++)
        {
            for(j=1;j<=w;j++)
            {
                if(j>=weight[i-1] && mat[i-1][j]<value[i-1]+mat[i-1][j-weight[i-1]])
                    mat[i][j]=value[i-1]+mat[i-1][j-weight[i-1]];
                else
                    mat[i][j]=mat[i-1][j];
            }
        }
        for(i=0;i<=weight.length;i++)
        {
            for(j=0;j<=w;j++)
                System.out.print(mat[i][j]+"  ");
            System.out.println();
        }
        i=weight.length;
        j=w;
        while(i>0 && j>0)
        {
            if(mat[i][j]==value[i-1]+mat[i-1][j-weight[i-1]])
            {
                System.out.print(weight[i-1]+ " ");
                j=j-weight[i-1];
                i=i-1;
            }
            else
                i--;   
        }
    }
}