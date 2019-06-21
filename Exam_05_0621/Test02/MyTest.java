public class MyTest{
    public static void main(String args[]){
    try {
    int result;
    result = MyCalc.divide(100, Integer.parseInt(args[0]));
    } catch (NumberFormatException err){
    System.out.println(err);
    } catch (MyException err){ //独自の例外をcatch
    System.out.println(err); //独自の例外の内容を表示する
    } finally {
    System.out.println("処理を実行しました");
    }
    }
    }

    class MyCalc{
        static int divide(int x, int y) throws MyException{
        if (y == 0){
        throw new MyException("0で割っちゃダメなんだってば!!");
        }
        return x / y;
        }
        }
        
    class MyException extends Exception{
        MyException(String msg){
        super(msg);
        }
        }