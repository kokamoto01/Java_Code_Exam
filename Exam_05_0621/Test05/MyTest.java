public class MyTest{
    public static void main(String[] args){
        //コンストラクターにメッセージとインターバル時間を指定してオブジェクトを作成
        MyThread mt1 = new MyThread("Thread #01", 1000); //オブジェクト(thread1)生成
        MyThread mt2 = new MyThread("Thread #02", 1500); //オブジェクト(thread2)生成
        //上記のオブジェクトをコンストラクターに指定してThreadクラスのオブジェクトを作成
        Thread thread1 = new Thread(mt1);
        Thread thread2 = new Thread(mt2);
        thread1.start(); //スレッドを開始
        thread2.start(); //スレッドを開始
    }
}

class MyThread implements Runnable{ //Threadクラスを継承
        String message;
        long interval;
        long count;
        MyThread(String message, long interval){ //コンストラクターでメッセージと
        this.message = message; //インターバル時間をメンバー変数に格納
        this.interval = interval;
        }
    public void run(){ //run()メソッドをオーバーライド
        try {
            while (true){ //無限ループ
            count++;
            System.out.println(message + " / count=" + count); //メッセージの出力
            Thread.sleep(interval); //インターバル時間待機(msec)
            }
        } catch (InterruptedException err){
            System.out.println(err);
        }
    }
}