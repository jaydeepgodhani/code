import java.util.*;
import java.io.*;

class algotest2 {
	public static void main(String arg[]) {
		String X = "BCA", Y = "CA";
		char A;
		int i, j, k, n1, t, m1;
		X = X + 'Q';

		t = 10;
		n1 = 1;
		m1 = 1;
		while (t-- > 0) {

			j = 23;
			for (i = 0; i < n1; ++i) {
				A = (char)('A' + j % 26);
				X = X+A;
				j = j * j + 2 * i * (t + 2) + 1;
				if (j < 0)
					j = j * -1;
			}

			for (i = 0; i < m1; ++i) {
				A = (char)('A' + j % 26);
				Y = Y+A;
				j = j * j + 2 * i * (t + 2) + 1;
				if (j < 0)
					j = j * -1;
			}

			int m = X.length(), n = Y.length();

			System.out.print(m + "    " + n + "    " + find(X, Y, m, n) + "\n");

			n1 = (int)(1.5 * n1 + 103);
			m1 = (int)(1.5 * m1 + 117);
		}

	}

static int find(String X, String Y, int m, int n)
{
	String a=X,b=Y;
	boolean b =true;
        char[] ch1=a.toCharArray();        
        char[] ch2=b.toCharArray();
        int[][] mat = new int[m+1][n+1];
        int i,j,count=0;
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
	return count;
}
}