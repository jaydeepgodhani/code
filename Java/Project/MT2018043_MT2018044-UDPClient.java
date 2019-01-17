import java.io.*;
import java.net.*;
import java.util.Scanner;

class client_socket {
    public static void main(String[] args) {
        try {
            DatagramSocket s = new DatagramSocket();
            byte[] indata = new byte[1024];
            Scanner sc = new Scanner(System.in);
            int i = 0;
            int count = 5;
            int a[] = new int[count];
            while (i < count)
                a[i++] = sc.nextInt();
            sc.close();
            String str = a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4];
            DatagramPacket dpk = new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("localhost"), 9874);
            //enter server's IP address instead of localhost to work with two machines
            s.send(dpk);
            DatagramPacket dpkrcv = new DatagramPacket(indata, indata.length);
            s.receive(dpkrcv);
            String str2 = new String(dpkrcv.getData());
            String[] ans = str2.split(" ");
            for (i = 0; i < ans.length-1; i++)
            {
                a[i] = Integer.parseInt(ans[i]);
                System.out.print(a[i]+" ");
            }
            float fl=Float.parseFloat(ans[i]);
            System.out.println("Average is "+fl);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}