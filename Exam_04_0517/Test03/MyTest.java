public class MyTest{
    public static void main(String args[]){
    Student taro = new Student(); //サブクラスのオブジェクトを生成
    taro.setProfile("蒲田太郎", 20, "日本工学院専門学校"); //サブクラスのメソッドの呼び出し
    taro.printProfile(); //サブクラスのメソッドの呼び出し
    }
class Person{
    protected String name; //サブクラスからアクセスされるためprotected
    protected int age; //サブクラスからアクセスされるためprotected
    }
    class Student extends Person{
    private String school; //自クラスからのアクセスのみのためprivate
    void setProfile(String name, int age, String school){
    super.name = name; //super.nameはスーパークラスのインスタンス変数
    super.age = age; //super.ageはスーパークラスのインスタンス変数
    this.school = school; //this.schoolはサブクラス(このクラス)インスタンス変数
    }
    void printProfile(){
    //superはないが、name,ageはより内側であるメソッドの引数もサブクラスのインスタンス変数も
    //存在しないのでスーパークラスのインスタンス変数
    //thisはないが、schoolはより内側であるメソッドの引数が存在しないのでサブクラスのインスタンス変数
    System.out.println(name + "さんは" + age + "歳です。" + school + "に通っています。");
    }
    }
}