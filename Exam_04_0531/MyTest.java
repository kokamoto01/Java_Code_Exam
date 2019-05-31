public class MyTest{
    public static void main(String args[]){
        int year = Integer.parseInt(args[0]);
        if (LeapYearUtil.isLeapYear(year)){ //クラスメソッドへのアクセス
            System.out.println(year + "年はうるう年です。");
        } else {
            System.out.println(year + "年はうるう年ではありません。");
        }
    }
}

class LeapYearUtil{
    static boolean isLeapYear(int year){ //クラスメソッドの定義
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}