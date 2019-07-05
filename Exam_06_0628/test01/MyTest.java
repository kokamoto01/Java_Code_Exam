import jdk.internal.dynalink.linker.LinkerServices.Implementation;

public class MyTest{
    public static void main(String[] args){
        MyThread thread1 = new MyThread("Thread #01", 1000);
        MyThread thread2 = new MyThread("Thread #02", 1500);
        thread1.start();    //スレッドを開始
        thread2.start();    //スレッドを開始
        try {
            Thread.sleep(10000);//インターバル時間待機（msec）
        } catch (InterruptedException err){
            System.out.println(err);
        }
    thread1.disable();
    //スレッドを停止（disable()メソッドは自分で定義したもの）
    thread2.disable();
    //スレッドを停止（disable()メソッドは自分で定義したもの）
    }
}

class MyMultiThread extends MyThread implements Runnable{
    String message;
    long interval;
    long count;
    boolean running;    //実行フラグを用意
    
    MyThread(String message, long interval){
    this.message = message;
    this.interval = interval;
    running = true;    //実行フラグを初期化
    }
    
    public void run(){
        try {
        while (running == true){    //実行フラグがtrueの間実行する
        count++;
        System.out.println(message + " / count=" + count);
        Thread.sleep(interval);
        }
    
        } catch (InterruptedException err){
        System.out.println(err);
        }
    }
    
    void disable(){     //実行フラグの内容を変更するメソッドを用意
    running = false;    //実行フラグのステータスを変更
    }
}