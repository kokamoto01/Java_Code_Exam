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
    BufferedWriter bw;
    void mainProc(){
        try {
            server = new ServerSocket(12345);
            // サーバーソケットを作成（TCP）
            while(true){
                socket = server.accept();
                System.out.println("クライアントがアクセスしました");
                bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bw.write("Server Accepted.");
                bw.newLine();
                bw.flush();
            }
        } catch (IOException err){
            System.out.println(err);
        }
    }
}