public class MyTest{
    public static void main(String args[]){
    Student taro = new Student(); //サブクラスのオブジェクトを生成
    taro.name = "蒲田太郎"; //スーパークラスの変数にアクセス
    taro.age = 20; //スーパークラスの変数にアクセス
    taro.school = "日本工学院専門学校"; //サブクラスの変数にアクセス
    System.out.println(taro.name + "さんは" + taro.age + "歳です。" + taro.school + "に通っています。");
    }
    }
    class Person{
    String name; //直接アクセスされるためアクセス修飾子なし
    int age; //直接アクセスされるためアクセス修飾子なし
    }
    class Student extends Person{ //Personクラスを継承してStudentクラスを定義
    String school; //直接アクセスされるためアクセス修飾子なし
}