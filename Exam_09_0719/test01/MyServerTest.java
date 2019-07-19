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
	int socketNumber;
	int messageCount;
	ClientWorker(Socket socket, int socketNumber){	//ソケットオブジェクトとソケット番号の保存
		this.socket = socket;
		this.socketNumber = socketNumber;
	}
	public void run(){							//マルチスレッドとなる処理
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true){
				if(messageCount >= 10){
					break;
				}
				Thread.sleep(1000);
				bw.write("socketNumber=" + socketNumber + ", messageCount=" + ++messageCount);
				bw.newLine();
				bw.flush();
			}
			socket.close();
			// メッセージを送り終えたらsocketを閉じる
		} catch (IOException err){
			System.out.println(err);
		} catch (InterruptedException err){
			System.out.println(err);
		}
	}
}

