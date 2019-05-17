public class k017c1355_Okamoto_Exam_01_01{
    public static void main(String args[]) {
        LeapYear ly = new LeapYear();
        System.out.println(ly.isLeapYear(Integer.parseInt(args[0])));
    }
}

class LeapYear{
    boolean isLeapYear(int year){
        if((year % 4 == 0) || (!(year % 100 == 0)) || (year % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}