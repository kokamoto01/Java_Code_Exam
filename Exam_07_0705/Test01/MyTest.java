import java.io.*;

public class MyTest{
    public static void main(String[] args){
        new MyFileStream().IOSProc();
    }
}

class MyFileStream{
    BufferedReader br;
    BufferedWriter bw;
    String buf;
    void IOSProc(){
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("sample.txt")));
            while(true){
                buf= br.readLine();
                if(buf.equals("#Exit")){
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