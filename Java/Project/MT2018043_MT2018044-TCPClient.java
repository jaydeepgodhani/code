import java.io.*;
import java.net.*;
import java.util.Scanner;
class client_socket {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3457);
            //enter server's IP address instead of localhost to work with two different machine
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            Scanner sc = new Scanner(System.in);
            int i = 0 , count = 5;
            int a[] = new int[count];
            float fl=0;
            while (i < count) {
                a[i++] = sc.nextInt();
            }
            String str = a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4];
            dout.writeUTF(str);
            //String str2 = (String) dis.readUTF();
            String[] ans = ((String) dis.readUTF()).split(" ");
            for (i = 0; i < ans.length-1; i++)
            {
                a[i] = Integer.parseInt(ans[i]);
                System.out.print(a[i]+" ");
            }
            fl=Float.parseFloat(ans[i]);
            System.out.println("Average is "+fl);
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}