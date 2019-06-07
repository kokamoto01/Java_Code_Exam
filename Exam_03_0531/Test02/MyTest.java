public class MyTest{
    public static void main(String args[]){
    Person taro = new Person(); //インスタンスとしてオブジェクトを生成
    taro.setName("蒲田太郎"); //オブジェクトのメソッドの呼び出し
    taro.setAge(20); //オブジェクトのメソッドの呼び出し
    System.out.println(taro.getName() + "さんは" + taro.getAge() + "歳です。");
    }
}

class Person{
    String name; //データにあたる「インスタンス変数(オブジェクト変数)」
    int age; //データにあたる「インスタンス変数(オブジェクト変数)」
    void setName(String name){ //インスタンス変数に値をセットするためのインスタンスメソッド
        this.name = name; //インスタンス変数にメソッドの引数を代入
    }
    void setAge(int age){ //インスタンス変数に値をセットするためのインスタンスメソッド
        this.age = age; //インスタンス変数にメソッドの引数を代入
    }
    String getName(){ //インスタンス変数の値を取得するためのインスタンスメソッド
        return name; //インスタンス変数をメソッドの戻り値としてリターン
    }
    int getAge(){ //インスタンス変数の値を取得するためのインスタンスメソッド
        return age; //インスタンス変数をメソッドの戻り値としてリターン
    }
}