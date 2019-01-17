import java.io.*;
import java.net.*;
import java.util.Arrays;

class server_socket {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3457);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String[] str = ((String) dis.readUTF()).split(" ");
            int count = 5;
            int[] a = new int[count];
            float fl=0;
            for (int i = 0; i < str.length; i++)
            {
                a[i] = Integer.parseInt(str[i]);
                //System.out.println(a[i]);
                fl+=a[i];
            }
            fl/=count;
            Arrays.sort(a);
            String ans = a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+fl;
            dout.writeUTF(ans);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}