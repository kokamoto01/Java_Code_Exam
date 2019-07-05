import java.io.*;
public class MyTest{
    public static void main(String[] args){
        new MyClass().ioStreamProc();
    }
}

class MyClass{
    BufferedReader br;
    BufferedWriter bw;
    String buf;
    void ioStreamProc(){
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Sample.txt")));
            while (true){
                buf = br.readLine();    //標準入力から1行読み込み
                bw.write(buf);    //内容をバッファーへ書き出し
                bw.newLine();    //改行をバッファーへ追加
                bw.flush();    //バッファーをファイルへ書き出し
            }
        } catch (IOException err){
            System.out.println(err);
        }
    }
}