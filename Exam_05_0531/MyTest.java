public class MyTest{
    public static void main(String args[]){
        MathUtil mathObj = new MathUtil();
        //int型の引数のaddValueメソッドの呼び出し
        System.out.println("計算結果は" + mathObj.addValue(10, 20) + "です。");
        //double型の引数のaddValueメソッドの呼び出し
        System.out.println("計算結果は" + mathObj.addValue(10.0, 20.0) + "です。");
    }
}

class MathUtil{
    //名称は同じだが、引数の型が異なるため以下のaddValueメソッドは別のものとして扱われる
    int addValue(int x, int y){
        return x + y;
    }
    double addValue(double x, double y){
        return x + y;
    }
}