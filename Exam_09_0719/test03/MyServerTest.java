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
	BufferedReader br;
	BufferedReader brToSocket;
	String buf;
	int socketNumber;
	int messageCount;
	String msg[];
	String htmlFile = "index.html";
	ClientWorker(Socket socket, int socketNumber){	//ソケットオブジェクトとソケット番号の保存
		this.socket = socket;
		this.socketNumber = socketNumber;
	}
	public void run(){							//マルチスレッドとなる処理
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("index.html")));
			// htmlをファイルとして読み込む
			brToSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// クライアントへの受け流し
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true){
				buf = brToSocket.readLine();
				msg = buf.split(" ");
				if(msg[0].equals("GET")){
					// ファイルに出力
					if(!msg[1].equals("/")){
						// ルートでないならファイルに格納
						htmlFile = msg[1];
					}
					System.out.println(htmlFile);
				}
				if(buf.equals("")){
					// 空行判定する(全部読み終えたら終了。改行文字\r\n(CRLFの場合)はリストには載らない)
					break;
				}
				bw.write("HTTP/1.1 200 OK");
				bw.newLine();
				bw.write("Content-Type: text/html; charset=utf-8");
				bw.newLine();
				bw.newLine();
				System.out.println(buf);
			}
			while (true){
				buf = br.readLine();
				if (buf == null){
					break;
				}
				bw.write(buf);
				bw.newLine();
			}
			bw.flush();
			socket.close();
			// メッセージを送り終えたらsocketを閉じる
		} catch (IOException err){
			System.out.println(err);
		}
	}
}

