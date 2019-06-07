/*　ベストプラクティス　*/
public class MyTest{
    public static void main(String args[]){
        //初期値をコンストラクターの引数として指定
        Student taro = new Student("蒲田太郎", 20, "日本工学院専門学校");
        taro.printProfile();
    }
}

class Person{
    private String name; //自クラスからのアクセスのみのためprivate
    private int age; //自クラスからのアクセスのみのためprivate
    Person(String name, int age){ //初期化のための2引数のコンストラクター
        this.name = name;
        this.age = age;
    }
    String getName(){ //値を取得するためのアクセサー(ゲッター)
        return name;
    }
    int getAge(){ //値を取得するためのアクセサー(ゲッター)
        return age;
    }
}

class Student extends Person{
    private String school; //自クラスからのアクセスのみのためprivate
    Student(String name, int age, String school){
        super(name, age); //スーパークラスのコンストラクターの呼び出し
        this.school = school;
    }
    String getSchool(){ //値を取得するためのアクセサー(ゲッター)
        return school;
    }
    void printProfile(){
        //メソッドを通じてインスタンス変数にアクセスする。呼び出しにはsuperやthisを使う
        System.out.println(super.getName() + "さんは" + super.getAge() + "歳です。" +this.getSchool() + "に通っています。");
    }
}