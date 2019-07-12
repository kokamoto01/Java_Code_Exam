import java.io.*;

public class Exam_04_01{
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
            br = new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("sample_fix.txt")));
            while(true){
                buf= br.readLine();
                if (buf == null){
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