public class MyTest{
    public static void main(String args[]){
    //初期値をコンストラクターの引数として指定
    Student taro = new Student("蒲田太郎", 20, "日本工学院専門学校");
    taro.printProfile();
    }
}

class Person{
    protected String name; //サブクラスからアクセスされるためprotected
    protected int age; //サブクラスからアクセスされるためprotected
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    private String school; //自クラスからのアクセスのみのためprivate
    Student(String name, int age, String school){
        super(name, age); //スーパークラスのコンストラクターの呼び出し
        this.school = school;
    }
    void printProfile(){
        //スーパークラスのインスタンス変数に直接アクセス
        System.out.println(name + "さんは" + age + "歳です。" + school + "に通っています。");
    }
}