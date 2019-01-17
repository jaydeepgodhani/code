import java.util.*;
class dpmatrix
{
    public static void main(String args[])
    {
        int i,j;
        int[][] input = {{11,10,9},{12,13,8},{4,6,7}};
        int r=input.length, c=input[0].length;
        int[][] mat = new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(j+1<=c-1 && input[i][j+1]-1 == input[i][j])
                    mat[i][j]=mat[i][j+1]+1;
                if(i-1>=0 && input[i-1][j]-1 == input[i][j])
                    mat[i][j]=mat[i-1][j]+1;
                if(i+1<=r-1 && input[i+1][j]-1 == input[i][j])
                    mat[i][j]=mat[i+1][j]+1;
                if(j-1>=0 && input[i][j-1]-1 == input[i][j])
                    mat[i][j]=mat[i][j-1]+1;
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}