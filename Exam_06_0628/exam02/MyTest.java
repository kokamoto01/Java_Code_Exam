public class MyTest{

    public static void main(String[] args){
        int threadCount = Integer.parseInt(args[0]);
        int lifeTime = Integer.parseInt(args[1]);
        MyThread[] thread = new MyThread[threadCount];

        for (int i=0; i < threadCount; i++){
            thread[i] = new MyThread("Thread #"+i, Integer.parseInt(args[i+2]));
            thread[i].start();
        }

        // MyThread mt1 = new MyThread("Thread #01", 1000);
        // MyThread mt2 = new MyThread("Thread #02", 1500);
        // Thread thread1 = new Thread(mt1);
        // Thread thread2 = new Thread(mt2);
        // thread1.start();
        // //スレッドを開始
        // thread2.start();
        // //スレッドを開始

    try {
    Thread.sleep(lifeTime);
    //インターバル時間待機（msec）
    } catch (InterruptedException err){
    System.out.println(err);
    }
    
    for(int i=0; i < threadCount; i++){
        thread[i].disable();
    }
    // mt1.disable();
    // //スレッドを停止（disable()メソッドは自分で定義したもの）
    // mt2.disable();
    // //スレッドを停止（disable()メソッドは自分で定義したもの)
    }
}

    class MyThread extends Thread{
        String message;
        long interval;
        long count;
        boolean running;
        //実行フラグを用意
        
        MyThread(String message, long interval){
            this.message = message;
            this.interval = interval;
            running = true;
            //実行フラグを初期化
        }
        
        public void run(){
            try {
                while (running == true){
                //実行フラグがtrueの間実行する
                count++;
                System.out.println(message + " / count=" + count);
                Thread.sleep(interval);
                }
            } catch (InterruptedException err){
        
        System.out.println(err);
        
        }
        
        }
        
        void disable(){
        //実行フラグの内容を変更するメソッドを用意
        
        running = false;
        //実行フラグのステータスを変更
        
        }
        
}