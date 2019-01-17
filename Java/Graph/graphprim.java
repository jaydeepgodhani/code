import java.util.*;
class graphprim
{
    static boolean ans=true;;
    static void addEdge(int i, int j, int wt, boolean dr,int[][] mat)
    {
        if(dr)
        {   mat[i][j]=wt;mat[j][i]=-1;}
        else
        {   mat[i][j]=wt;mat[j][i]=wt;}
    }
    static void trvdfs(int start, int[][] mat, int nodes, ArrayList<Integer> al, Queue<Integer> qu)
    {
        int j=0;
        int min = Integer.MAX_VALUE,node=start;
        al.add(start);
        System.out.print(start+" ");
        for(j=0; j<nodes; j++)
        {
            if(mat[start][j]>0 && !al.contains(j))
            {
                if(mat[start][j]<min)
                {
                    min = mat[start][j];
                    node = j;
                }
                qu.add(mat[start][j]);
            }
        }
        trvdfs(node, mat, nodes, al, qu);
    }
    public static void main(String args[])
    {
        int i,j,nodes=6,wt=1;
        int[][] mat = new int[nodes][nodes];
        ArrayList<Integer> al = new ArrayList<Integer>();
        Queue<Integer> qu = new PriorityQueue<Integer>();
        boolean dr = false;
        addEdge(0,2,4,dr,mat);
        addEdge(0,1,8,dr,mat);
        addEdge(2,3,8,dr,mat);
        addEdge(1,2,11,dr,mat);
        addEdge(1,5,1,dr,mat);
        addEdge(1,4,7,dr,mat);
        addEdge(3,4,2,dr,mat);
        addEdge(4,5,6,dr,mat);

        trvdfs(0, mat, nodes, al, qu);
        for(i=0; i<nodes; i++)
        {
            for(j=0; j<nodes; j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}