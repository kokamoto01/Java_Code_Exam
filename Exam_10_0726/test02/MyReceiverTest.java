import java.io.*;
import java.net.*;

public class MyReceiverTest{
	public static void main(String[] args){
		new MyReceiverClass().mainProc();
	}
}

class MyReceiverClass{
    MulticastSocket socket;
    DatagramPacket packet;
    byte[] buf;
    String msg;
    void mainProc(){
        try {
            buf = new byte[65535];
            socket = new MulticastSocket(12345);
            packet = new DatagramPacket(buf, buf.length);
				socket.joinGroup(InetAddress.getByName("239.0.0.10"));
                // 239.0.0.1のマルチキャスト(クラスD(224.0.0.0 ~ 239.255.255.255))
                // IGMP(Internet Group Membership Protocol)で繋がる
                // ブロードキャストとマルチキャストの違いを考慮すること
            while (true){
                socket.receive(packet);
                msg = new String(buf, 0, packet.getLength());
                System.out.println(msg);
            }
		} catch (IOException err){
			System.out.println(err);
		}
	}
}
