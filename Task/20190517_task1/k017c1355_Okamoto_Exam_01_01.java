public class k017c1355_Okamoto_Exam_01_01{
    public static void main(String args[]) {
        LeapYear ly = new LeapYear();
        System.out.println(ly.isLeapYear(Integer.parseInt(args[0])));
    }
}


//ケース１
/* 問題点：
処理を分けすぎている。できるだけ処理は１つにまとめたほうが美しい。 */

/* class LeapYear{
    boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
} */

//ケース２
/* 解決：処理を1つにまとめて見栄えが良くなった。
問題点： (!(year % 100 == 0))と(year % 4 == 0)、(year % 400 == 0)と見栄えがかみ合っていない。
(year % 4 == 0)、(year % 400 == 0)と(!(year % 100 == 0))で分けるのが見栄えが良いが、
4で割り切れるかつ100で割り切れるかつ400で割り切れない → 4で割り切れるかつ400で割り切れないかつ100で割り切れる は同じ意味なのか？

全く意味が違うのでこれが最善解だと考えた。
*/
class LeapYear{
    boolean isLeapYear(int year){
        if((year % 4 == 0) || (!(year % 100 == 0)) || (year % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}