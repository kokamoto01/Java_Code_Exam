public class MyTest{
    public static void main(String[] args) {
        Person taro = new Person(); //オブジェクトの生成
        taro.name = "蒲田太郎";
        taro.age = 20;
        System.out.println(taro.name + "さんは" + taro.age + "歳です。");
    }
}

class Person{
    String name; //データの設定
    int age; //データの設定
}