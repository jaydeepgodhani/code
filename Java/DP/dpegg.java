import java.util.*;
class dpegg
{
    public static void main(String args[])
    {
        int egg=2;
        int floor=100;
        int[][] mat = new int[egg+1][floor+1];
        int i,j,k,min=floor,temp;
        for(i=0;i<=egg;i++)
        {
            for(j=0;j<=floor;j++)
            {
                if(i==0)
                    mat[i][j]=0;
                else if(j==0)
                    mat[i][0]=0;
                else if(i==1)
                    mat[i][j]=j;
                else if(j==1)
                    mat[i][j]=1;
                else
                { 
                    mat[i][j]=floor;
                    for(k=1;k<=j;k++)
                    {
                        temp = 1+ Math.max(mat[i-1][k-1],mat[i][j-k]);
                        if(temp<mat[i][j])
                            mat[i][j]=temp;
                    }
                }
            }
        }
        System.out.println(mat[egg][floor]);
    }
}
