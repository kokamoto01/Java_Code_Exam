public class MyTest{
    public static void main(String args[]){
        Student taro = new Student();
    }
}

class Student extends Person{
    Student(){
        System.out.println("Studentクラスのコンストラクターが起動しました");
    }
}

class Person{
    Person(){
        System.out.println("Personクラスのコンストラクターが起動しました");
    }
}
