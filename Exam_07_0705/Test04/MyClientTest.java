import java.io.*;
import java.net.*;

public class MyClientTest{
    public static void main(String[] args){
        new MyClientClass().mainProc();
    }
}

class MyClientClass{
    Socket socket;
    BufferedReader br;
    String buf;
    void mainProc(){
        try{
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 12345);
            // Socketクライアントは接続するIPアドレス(またはドメイン名)とポート番号を指定する
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            buf = br.readLine();
            System.out.println(buf);
            socket.close();
        } catch (IOException err){
            System.err.println(err);
        }
    }
}