import java.util.*;
class graphdfs
{
    static void addEdge(int i, int j, int wt, boolean dr,int[][] mat)
    {
        if(dr)
            mat[i][j]=wt;
        else{
            mat[i][j]=wt;mat[j][i]=wt;}
    }
    static void trvdfs(int start, int[][] mat, ArrayList<Integer> al, int nodes)
    {
        int j=0;
        System.out.print(start+" ");
        al.add(start);
        while(j<nodes)
        {
            if(mat[start][j]==1 && !al.contains(j))
                trvdfs(j, mat, al, nodes);
            j++;
        }
    }
    static void trvbfs(int start, int[][] mat, Queue<Integer> qu, ArrayList<Integer> al2, int nodes)
    {
        int j=0;
        while(j<nodes)
        {
            if(mat[start][j]==1 && qu.peek()!=j && !al2.contains(j))
            {
                System.out.print(j +" ");
                qu.add(j);
            }
            j++;
        }
        al2.add(qu.poll());
        if(!qu.isEmpty())
            trvbfs(qu.peek(), mat, qu, al2, nodes);
    }
    public static void main(String args[])
    {
        int i,j,nodes=4,wt=1;
        int[][] mat = new int[nodes][nodes];
        boolean dr = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        Queue<Integer> qu = new LinkedList<Integer>();
        addEdge(0,1,wt,dr,mat);
        addEdge(0,2,wt,dr,mat);
        addEdge(1,3,wt,dr,mat);
        /*addEdge(2,6,wt,dr,mat);
        addEdge(5,9,wt,dr,mat);
        addEdge(5,10,wt,dr,mat);
        addEdge(4,7,wt,dr,mat);
        addEdge(4,8,wt,dr,mat);
        addEdge(7,11,wt,dr,mat);
        addEdge(7,12,wt,dr,mat);*/
        trvdfs(0,mat,al,nodes);
        qu.add(1);
        System.out.println();
        System.out.print("1 ");
        trvbfs(1,mat,qu,al2,nodes);
        System.out.println();
        for(i=0; i<nodes; i++)
        {
            for(j=0; j<nodes; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}