import java.io.*;
import java.net.*;

public class MySenderTest{
	public static void main(String[] args){
		new MySenderClass().mainProc();
	}
}


class MySenderClass{
    DatagramSocket socket;
    DatagramPacket packet;
    byte[] buf;
    // String型では通らない（仕様）
    int messageCount;
    void mainProc(){
        try {
            socket = new DatagramSocket();
            while (true){
                buf = new String("Message Count=" + ++messageCount).getBytes();
                packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 12345);
                // UDPならブロードキャスト。1対多
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
