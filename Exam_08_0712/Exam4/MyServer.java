import java.io.*;
import java.net.*;

public class MyServer{
    public static void main(String[] args){
        new MyServerClass().mainProc();
    }
}

class MyServerClass{
    ServerSocket server;
    Socket socket;
    ClientWorker worker;
    int socketNumber;
    void mainProc(){
        try {
            server = new ServerSocket(12345);
            while (true){
                socket = server.accept();
                //クライアントごとのオブジェクトの作成とマルチスレッド処理の実行
                worker = new ClientWorker(socket, ++socketNumber);
                worker.start();
            }
        } catch (IOException err){
            System.out.println(err);
        }
    }
}

class ClientWorker extends Thread{
    Socket socket;
    BufferedWriter bw;
    BufferedReader br;
    int socketNumber;
    int messageCount;
    String buf;

    ClientWorker(Socket socket, int socketNumber){
        //ソケットオブジェクトとソケット番号の保存
        this.socket = socket;
        this.socketNumber = socketNumber;
    }
    public void run(){
        //マルチスレッドとなる処理
        try {
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(new FileInputStream("index.html")));
            while (true){
                buf = br.readLine();
                if(buf == null){
                    break;
                }
                bw.write(buf);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException err){
            System.out.println(err);
        }
    }
}