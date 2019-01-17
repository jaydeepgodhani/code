import java.util.*;
class dpmcm
{
    public static void main(String[] args)
    {
        int[] sizes = {4,2,3,1,3};
        int z = sizes.length-1;
        int ind,a,b;
        int[][] mat = new int[z][z];
        int i,j;
        for(i=0;i<z;i++)
        {
            ind = z-i;
            for(j=0;j<z;j++)
            {
                if(ind<j+1)
                {
                    a = mat[i][j-1] + (sizes[ind-1]*sizes[j]*sizes[j+1]);
                    b = mat[i-1][j] + (sizes[ind-1]*sizes[ind]*sizes[j+1]);
                    if(Math.min(a,b)==a)
                    {
                        System.out.print("<"+(i)+" "+(j-1)+" "+(j+1)+">\n");
                    }
                    else
                    {
                        System.out.print("<"+(i-1)+" "+(j)+" "+(j+1)+">\n");
                    }
                    mat[i][j]=Math.min(a,b);
                }
            }
        }
        for(i=0;i<z;i++)
        {
            for(j=0;j<z;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}
