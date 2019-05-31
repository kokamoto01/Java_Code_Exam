public class MyTest{
    public static void main(String args[]){
        Person taro = new Person(); //インスタンスとしてオブジェクトを生成
        taro.setProfile("蒲田太郎", 20); //オブジェクトのメソッドの呼び出し
        taro.printProfile(); //オブジェクトのメソッドの呼び出し
    }
}
class Person{
    String name; //データにあたる「インスタンス変数(オブジェクト変数)」
    int age; //データにあたる「インスタンス変数(オブジェクト変数)」
    void setProfile(String name, int age){ //変数に値をセットする「インスタンスメソッド」
        this.name = name;
        this.age = age;
    }
    void printProfile(){ //変数の値を利用する「インスタンスメソッド」
        System.out.println(name + "さんは" + age + "歳です。");
    }
}