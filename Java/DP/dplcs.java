import java.util.*;
class dplcs
{
    public static void main(String args[])
    {
        String a="abcbdab",b="bdcaba";
        char[] ch1=a.toCharArray();        
        char[] ch2=b.toCharArray();
        int[][] mat = new int[ch1.length+1][ch2.length+1];
        int i,j;
        int count=0;
        for(i=0;i<=ch1.length;i++)
            mat[i][0]=0;
        for(j=1;j<=ch2.length;j++)
            mat[0][j]=0;
        for(i=1;i<=ch1.length;i++)
        {
            for(j=1;j<=ch2.length;j++)
            {
                if(ch1[i-1]==ch2[j-1])
                {
                    mat[i][j]=mat[i-1][j-1]+1;
                }
                else
                {
                    mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
                }
            }
        }
        for(i=0;i<=ch1.length;i++)
        {
            for(j=0;j<=ch2.length;j++)
            {
                System.out.print(mat[i][j]);
            }
        System.out.println();
        }
        i=ch1.length;
        j=ch2.length;
        while(mat[i][j]!=0)
        {
            if(mat[i][j-1]==mat[i][j])
                j--;
            else if(mat[i][j]==mat[i-1][j])
                i--;
            else
            {
                count++;
                //System.out.print(ch1[i-1]);
                i--;j--;
            }
        }
        count += (ch1.length-count) + (ch2.length-count);
        System.out.println(count);
    }
}
