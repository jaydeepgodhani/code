import java.util.*;
class wordbreak
{
    public static void main(String[] args) {
        String str = "sam samsung sungme i like mango phone";
        String[] ar2 = str.split(" ");
        String input = "samsungmeiphonemangoiii";
        char[] ar1 = input.toCharArray();
        int[][] mat = new int[ar1.length+1][ar2.length];
        int i,j;
        for(i=0;i<=ar1.length;i++)
        {
            for(j=0;j<ar2.length;j++)
            {
                if(i==0)
                    mat[i][j]=0;
                else
                {
                    if(mat[i-1][j]==ar2[j].length())
                    {
                        if(ar1[i-1]==ar2[j].charAt(0))
                            mat[i][j]=1;
                        else
                            mat[i][j]=0;
                    }
                    else
                    {
                        if(ar1[i-1]==ar2[j].charAt(mat[i-1][j]))
                            mat[i][j]=mat[i-1][j]+1;
                        else
                            mat[i][j]=0;
                    }
                }
            }
        }
        /*for(i=0;i<=ar1.length;i++)
        {
            for(j=0;j<ar2.length;j++)
                System.out.print(mat[i][j]);
            System.out.println();
        }*/
        boolean ans=false;
        for(j=0;j<ar2.length;j++)
        {
            i=1;
            ans = backtrack(mat,ar1,ar2,i,j);
            if(ans == true)
                break;
        }
        System.out.println(ans);
    }
    static boolean backtrack(int[][] mat, char[] ar1, String[] ar2, int i, int j)
    {
        int z;
        boolean ans = false;
        if(mat[i][j]==1)
        {
            if(i<=ar1.length && mat[i+ar2[j].length()-1][j]==ar2[j].length())
            {
                i+=ar2[j].length()-1;
                if(i==ar1.length)
                {
                    ans = true;
                    return ans;
                }
                else
                {
                    i++; 
                    for(z=0;z<ar2.length;z++)
                    {
                        ans = backtrack(mat,ar1,ar2,i,z);
                        if(ans == true)
                            return ans;
                    }
                }
            }
        }
        return ans;
    }
}
