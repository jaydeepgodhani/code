import java.util.*;
class graphtopologic
{
    static boolean ans=true;;
    static void addEdge(int i, int j, int wt, boolean dr,int[][] mat)
    {
        if(dr)
        {   mat[i][j]=wt;mat[j][i]=-1;}
        else
        {   mat[i][j]=wt;mat[j][i]=wt;}
    }
    static void trvdfs(int start, int[][] mat, int nodes)
    {
        int j=0,count=0,z;
        boolean bl;
        System.out.print(start + " ");
        for(j=0; j<nodes; j++)
        {
            if(mat[start][j]==1)
            {
                mat[start][j]=0;
                mat[j][start]=0;
                for(z=0;z<nodes;z++)
                {
                    if(mat[j][z]!=0)
                        break;
                }
                if(z==nodes)
                    System.out.print(j+" ");
            }
        }
        for(int i=0; i<nodes; i++)
        {
            bl = false;
            for(j=0; j<nodes; j++)
            {
                if(mat[i][j]==1)
                    count =1;
                if(j==nodes-1 && count==1)
                    bl = true;
            }
            if(bl == true)
            {
                trvdfs(i, mat, nodes);
                break;
            }
        }
    }
    public static void main(String args[])
    {
        int i,j,nodes=8,wt=1,count=0;
        int[][] mat = new int[nodes][nodes];
        boolean dr = true;
        boolean start = false;
        addEdge(1,3,wt,dr,mat);
        addEdge(0,3,wt,dr,mat);
        addEdge(1,4,wt,dr,mat);
        addEdge(2,4,wt,dr,mat);
        addEdge(2,7,wt,dr,mat);
        addEdge(3,5,wt,dr,mat);
        addEdge(3,6,wt,dr,mat);
        addEdge(3,7,wt,dr,mat);
        addEdge(4,6,wt,dr,mat);

        for(i=0; i<nodes; i++)
        {
            start = false;
            for(j=0; j<nodes; j++)
            {
                if(mat[i][j]==1)
                    count = 1;
                else if(j==nodes-1 && count == 1)
                    start = true;
            }
            if(start == true)
            {
                trvdfs(i, mat, nodes);
                break;
            }
        }
    }
}