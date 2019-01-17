import java.util.*;
class dprod
{
    public static void main(String agrs[])
    {
        int[] rl = {1,2,3,4,5,6,7,8};//always increamenting
        int[] price = {1,5,8,9,10,17,17,20};
        int[][] mat= new int[rl.length+1][rl.length+1];
        int i=0,j=0,a,b;
        while(i<=rl.length)
        {
            mat[0][j++]=0;
            mat[i++][0]=0;
        }
        for(i=1;i<=rl.length;i++)
        {
            for(j=1;j<=rl.length;j++)
            {
               if(i>j)
                   mat[i][j]=mat[i-1][j];
               else
               {
                   mat[i][j]=price[i-1];
                   a=1;b=j-1;
                   while(a<=b)
                   {
                        if(a+b==j)
                        {
                            if(mat[i][a]+mat[i][b]>mat[i][j])
                                mat[i][j]=mat[i][a]+mat[i][b];
                            a++;b--;
                        }
                        else if(a+b<j)
                            a++;
                        else
                            b--;
                   }
               }
            }
        }
        for(i=0;i<=rl.length;i++)
        {
            for(j=0;j<=rl.length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print(mat[rl.length][rl.length]);
    }
}
