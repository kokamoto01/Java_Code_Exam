import java.util.*; //java.utilパッケージのすべてのクラスを

//インポート

public class MyTest{
public static void main(String[] args){
Random random = new Random();
Calendar calendar = Calendar.getInstance();
System.out.println(random.nextInt()); //乱数を発生させて表示
System.out.println(calendar.getTime()); //現在の日時を表示
}
}