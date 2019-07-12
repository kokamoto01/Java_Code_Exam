import java.io.*;
import java.net.*;

public class MyServerTest{
    public static void main(String[] args){
        new MyServerClass().mainProc();
    }
}

class MyServerClass{
    ServerSocket server;
    Socket socket;
    void mainProc(){
        try {
            server = new ServerSocket(12345);
            // サーバーソケットを作成（TCP）
            while(true){
                socket = server.accept();
                // クライアントからのアクセスと待機
                System.out.println("クライアントがアクセスしました");
                socket.close();
                // クライアントとのソケット通信終了
            }
        } catch (IOException err){
            System.out.println(err);
        }
    }
}