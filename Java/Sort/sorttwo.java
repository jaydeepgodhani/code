import java.util.*;
class sorttwo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int n,m;
        for(int i=0; i<tests; i++)
        {
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] a=new int[n][2];
            int people[]=new int[m];
            for(int j=0; j<n; j++)
            {
                a[j][0] = sc.nextInt();
                a[j][1] = sc.nextInt();
            }
            
            for(int k=0; k<m; k++)
            {
                people[k]=sc.nextInt();
            }
            for(i=0; i<tests; i++)
            {
                System.out.println(people[i]);
            }
        }
    }
}