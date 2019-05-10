public class MySample {
    public static void main(String args[]) {
        MyClass mc = new MyClass();
        mc.sayHello();
    }
}

class MyClass{
    void sayHello(){
        System.out.println("Hello, World!");
    }
}