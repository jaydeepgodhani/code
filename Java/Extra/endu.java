import java.util.*;
import java.io.*;
class endu
{
    public static void main(String args[]) throws Exception
    {
        //System.out.println(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        System.out.println("hi "+args[0]+" hi");

        int lines = 0;  
        String in1=reader.readLine();
        String command;
        while (in1!=null)
        {
            lines++;
            System.out.println(in1);
            in1 = reader.readLine();
            command = in1.split("");
            System.out.print(command);
        }
        System.out.println(lines);
    }
}