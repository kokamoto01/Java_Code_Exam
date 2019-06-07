public class MyTest{
    public static void main(String args[]){
        //2引数のコンストラクターを指定してオブジェクトを生成(最初にオプションを設定しておく)
        Person taro = new Person("蒲田太郎", 20);
        taro.printProfile();
        //引数のないコンストラクターを指定してオブジェクトを生成
        Person hanako = new Person();
        hanako.setProfile("八王子花子", 21);
        hanako.printProfile();
    }
}

class Person{
    String name;
    int age;
    Person(){ //引数のないコンストラクターを定義
    }
    Person(String name, int age){ //2引数のコンストラクターを定義
        this.name = name;
        this.age = age;
    }
    void setProfile(String name, int age){
        this.name = name;
        this.age = age;
    }
    void printProfile(){
        System.out.println(name + "さんは" + age + "歳です。");
    }
}