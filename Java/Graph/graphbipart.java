import java.util.*;
class graphbipart
{
    static boolean ans=true;;
    static void addEdge(int i, int j, int wt, boolean dr,int[][] mat)
    {
        if(dr)
            {mat[i][j]=wt;mat[j][i]=-1;}
        else{
            mat[i][j]=wt;mat[j][i]=wt;}
    }
    static boolean trvdfs(int start, int[][] mat, ArrayList<Integer> al, int nodes, boolean color, ArrayList<Integer> blue)
    {
        int j=0;
        System.out.print(start+" ");
        al.add(start);
        while(j<nodes)
        {
            if(mat[start][j]==1)
            {  
                if(!al.contains(j))
                {
                    if(!blue.contains(start))
                        blue.add(j);
                    trvdfs(j, mat, al, nodes, color, blue);
                }
                if((blue.contains(start) && blue.contains(j))||(!blue.contains(start) && !blue.contains(j)))
                {
                    ans = false;
                    break;
                }
            }
            j++;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int i,j,nodes=5,wt=1;
        int[][] mat = new int[nodes][nodes];
        boolean dr = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean color = true;
        ArrayList<Integer> blue = new ArrayList<Integer>();
        addEdge(0,2,wt,dr,mat);
        addEdge(0,3,wt,dr,mat);
        addEdge(1,3,wt,dr,mat);
        //addEdge(2,3,wt,dr,mat);
        addEdge(1,4,wt,dr,mat);
        addEdge(1,2,wt,dr,mat);
        //addEdge(0,1,wt,dr,mat);

        boolean bipart = trvdfs(0, mat, al, nodes, color, blue);
        System.out.println(bipart);

        for(i=0; i<nodes; i++)
        {
            for(j=0; j<nodes; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}