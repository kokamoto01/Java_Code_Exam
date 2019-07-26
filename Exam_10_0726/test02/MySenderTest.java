import java.io.*;
import java.net.*;

public class MySenderTest{
	public static void main(String[] args){
		new MySenderClass().mainProc();
	}
}

class MySenderClass{
    MulticastSocket socket;
    DatagramPacket packet;
    byte[] buf;
    int messageCount;
    void mainProc(){
        try {
            socket = new MulticastSocket();
            while (true){
                buf = new String("K.Okamoto || Message Count=" + ++messageCount).getBytes();
                packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("239.0.0.1"), 12345);
                // 宛先はマルチキャストアドレスを指定する
                socket.send(packet);
                Thread.sleep(1000);
            }
		} catch (IOException err){
			System.out.println(err);
		} catch (InterruptedException err){
			System.out.println(err);
		}
	}
}
