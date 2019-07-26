import java.io.*;
import java.net.*;

public class MyReceiverTest{
	public static void main(String[] args){
		new MyReceiverClass().mainProc();
	}
}

class MyReceiverClass{
    DatagramSocket socket;
    DatagramPacket packet;
    byte[] buf;
    String msg;
    void mainProc(){
        try {
            buf = new byte[65535];
            // IPパケットの最大値。絶対にこれ以上は大きくならないからこれでいい
            socket = new DatagramSocket(12345);
            // 12345はポート番号
            packet = new DatagramPacket(buf, buf.length);
            while (true){
                socket.receive(packet); 
                // パケットの受信
                msg = new String(buf, 0, packet.getLength());
                // データが入っている所(bufを0番目~パケットの最後まで)をByte→Stringに変換（Byte型だと人間には読めない）
                System.out.println(msg);
            }
		} catch (IOException err){
			System.out.println(err);
		}
	}
}
