public class MySample{
    public static void main(String args[]) {
        MyClass mc = new MyClass();
        mc.testString();
    }
}

class MyClass{
    void testString(){
        String s1 = "XYZ";
        String s2 = "XYZ";
        // String s1 = new String("XYZ");
        // String s2 = new String("XYZ");
        if(s1.equals(s2)){
            System.out.println("Match!");
        }else{
            System.out.println("Unmatch!");
        }
    }
}