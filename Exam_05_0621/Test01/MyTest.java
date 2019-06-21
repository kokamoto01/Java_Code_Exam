public class MyTest{
    public static void main(String args[]){
    try { //try文で例外が発生する可能性がある
    int divide; //処理を記述する
    int result;
    divide = Integer.parseInt(args[0]); //パラメーターが文字の場合、数字変換エラーが
    
    //発生する
    
    result = 100 / divide; //割られる数が0の場合、0除算例外が発生する
    } catch (NumberFormatException err){ //catch文で例外発生時の処理を記述する
    System.out.println("実行時パラメーターが数字ではありません");
    } catch (ArithmeticException err){ //catch文で例外発生時の処理を記述する
    System.out.println("実行時パラメーターに0を指定しました");
    } finally { //finally文は例外が発生してもしなくても
    System.out.println("処理を実行しました"); //実行される
    }
    }
    }