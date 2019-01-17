import java.util.*;
public class backtrackmaxregion
{
    static int count, max;
    public static void main(String args[])
    {
        int row=5,col=5;
        int a[][]={{1,1,0,0,0},{0,1,1,0,1},{0,0,0,1,0},{1,0,0,1,0},{0,1,0,1,0}};
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(a[i][j]==1)
                {
                    count = 0;
                    a = maxregion(a,i,j,row,col);
                }
            }
        }
    }
    static int[][] maxregion(int[][] a, int i, int j, int row, int col)
    {
        a[i][j]=0;
        count++;
        if(j+1<col && a[i][j+1]==1)
            a = maxregion(a, i, j+1, row, col);
        if(i+1<row && a[i+1][j]==1)
            a = maxregion(a, i+1, j, row, col);
        if(j-1>0 && a[i][j-1]==1)
            a = maxregion(a, i, j-1, row, col);
        if(count>max)
            max=count;
        System.out.println(max);
        return a;
    }
}