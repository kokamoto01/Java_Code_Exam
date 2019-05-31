public class LeapYearTest{
    public static void main(String[] args){
        LeapYear ly = new LeapYear();
        System.out.println(ly.isLeapYear1(Integer.parseInt(args[0])));
        System.out.println(ly.isLeapYear2(Integer.parseInt(args[0])));
        System.out.println(ly.isLeapYear3(Integer.parseInt(args[0])));
        System.out.println(ly.isLeapYear4(Integer.parseInt(args[0])));
        System.out.println(ly.isLeapYear5(Integer.parseInt(args[0])));
        System.out.println(ly.isLeapYear6(Integer.parseInt(args[0])));
        System.out.println(ly.isLeapYear7(Integer.parseInt(args[0])));
        System.out.println(ly.isLeapYear8(Integer.parseInt(args[0])));
    }
}

class LeapYear{

    boolean isLeapYear1(int year){
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

    boolean isLeapYear2(int year){
        if (year % 4 == 0){
            if (year % 100 != 0){
                return true;
            } else {
                if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    boolean isLeapYear3(int year){
        if (year % 4 != 0){
            return false;
        } else if (year % 100 != 0){
            return true;
        } else if (year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }

    boolean isLeapYear4(int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        } else if (year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }

    boolean isLeapYear5(int year){
        if (year % 4 != 0){
            return false;
        }
        if (year % 100 != 0){
            return true;
        }
        if (year % 400 == 0){
            return true;
        }
        return false;
    }

    boolean isLeapYear6(int year){
        if (year % 400 == 0){
            return true;
        }
        if (year % 100 == 0){
            return false;
        }
        if (year % 4 == 0){
            return true;
        }
        return false;
    }

    boolean isLeapYear7(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }

    boolean isLeapYear8(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }

}