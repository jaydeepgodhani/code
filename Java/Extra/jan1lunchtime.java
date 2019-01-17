import java.util.*;
class jan1lunchtime
{
    public static void main(String args[])
    {
        int h,input,counter,col,row,m,n;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        for(int i=0; i<h; i++)
        {
            input = sc.nextInt();
            counter = 1;
            col = 0;
            int[][] ar = new int[input][input];
            while(col < input)
            {
                m = 0;
                n = col;
                while(n>=0)
                    ar[m++][n--] = counter++;
                col++;
            }
            row = 1;
            while(row < input)
            {
                m = row;
                n = input-1;
                while(m<input)
                    ar[m++][n--] = counter++;
                row++;
            }
            for(int d=0; d<input; d++)
            {
                for(int f=0; f<input; f++)
                {
                    System.out.print(ar[d][f] + " ");
                }
                System.out.println();
            }
        }
    }
}