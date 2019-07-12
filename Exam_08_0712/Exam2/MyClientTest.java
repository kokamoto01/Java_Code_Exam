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
    int count;

    void mainProc(){
        try{
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 12345);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(count < 10){
                buf = br.readLine();
                System.out.println(buf);
                count++;
            }
        } catch (IOException err){
            System.err.println(err);
        }
    }
}