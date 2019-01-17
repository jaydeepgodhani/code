import java.io.*;
import java.util.*;

public class algotest {
    public static void main(String args[])
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("pluginfile.txt"));
            int lines = 0;
            while (reader.readLine() != null)
                lines++;
            reader.close();

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Insert k ");
            int k = sc1.nextInt();

            Scanner sc = new Scanner(new File("pluginfile.txt"));
            int[] ary = new int[lines];
            int i = 0, count = 1;
            while (sc.hasNextInt())
                ary[i++] = sc.nextInt();
            
            sc.close();
            sc1.close();

            HashSet<Integer> hs = new HashSet<Integer>();
            for(i=0;i<ary.length;i++)
            {
                if(!hs.contains(ary[i]))
                {
                    if(hs.size()<k)
                    {
                        hs.add(ary[i]);
                    }
                    else
                    {
                        //System.out.println("  "+ary[i]);
                        count++;
                        hs.clear();
                        hs.add(ary[i]);
                    }
                }
            }
            System.out.println("Count is "+count);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}