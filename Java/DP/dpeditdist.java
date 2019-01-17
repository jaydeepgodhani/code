import java.util.*;
class dpeditdist
{
    public static void main(String ar[])
    {
        String str1 = "kitten";
        String str2 = "sitting";
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        int[][] mat = new int[ch1.length+1][ch2.length+1];
        int i=0,j=0;
        for(i=0;i<=ch1.length;i++)
        {
            for(j=0;j<=ch2.length;j++)
            {
                if(i==0)
                    mat[i][j]=j;
                else if(j==0)
                    mat[i][j]=i;
                else if(ch1[i-1]==ch2[j-1])
                    mat[i][j]=mat[i-1][j-1];
                else
                    mat[i][j]=1+Math.min(mat[i-1][j],Math.min(mat[i][j-1],mat[i-1][j-1]));
            }
        }
        System.out.println(mat[i-1][j-1]);
    }
}
