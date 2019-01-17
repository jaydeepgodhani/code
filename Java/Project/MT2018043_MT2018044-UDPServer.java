import java.io.*;
import java.net.*;
import java.util.Arrays;

class server_socket {
    public static void main(String[] args) {
        try {
            DatagramSocket s = new DatagramSocket(9874);
            byte[] outdata = new byte[1024];
            byte[] indata = new byte[1024];
            DatagramPacket dpkrcv = new DatagramPacket(indata, indata.length);
            s.receive(dpkrcv);
            String rcv = new String(dpkrcv.getData());
            String[] prcs = rcv.split(" ");
            int[] a = new int[prcs.length];
            float fl = 0;
            for (int i = 0; i < prcs.length; i++) {
                a[i] = Integer.parseInt(prcs[i].trim());
                fl += a[i];
            }
            fl /= 5;
            Arrays.sort(a);
            String ans = a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+fl;
            InetAddress ipa = dpkrcv.getAddress();
            int port = dpkrcv.getPort();
            outdata = ans.getBytes();
            DatagramPacket dpk = new DatagramPacket(outdata, outdata.length, ipa, port);
            s.send(dpk);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}