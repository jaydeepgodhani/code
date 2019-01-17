import java.util.*;
class dpwaysdist
{
    public static void main(String args[])
    {
        int[] steps = {1,2,3};//always sorted
        int dist = 4;
        int i,j,temp = 0;
        int mat[][]=new int[steps.length][dist];
        for(i=0;i<steps.length;i++)
        {
            for(j=0;j<dist;j++)
            {
                if(i==0)
                {
                    if((j+1)%steps[i]==0)
                        mat[i][j]=1;
                }
                else
                {
                    if(steps[i]>j+1)
                        mat[i][j]=mat[i-1][j];
                    else if(steps[i]==j+1)
                        mat[i][j]=mat[i-1][j]+1;
                    else
                    {
                        temp = 0;
                        for(int z=0;z<=i;z++)
                            mat[i][j]+=mat[i][j-steps[z]];
                    }
                }
            }
        }
        for(i=0;i<steps.length;i++)
        {
            for(j=0;j<dist;j++)
                System.out.print(mat[i][j]);
            System.out.println();
        }
    }
}