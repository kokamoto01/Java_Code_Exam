public class MyTest{
    public static void main(String args[]){
        Person taro = new Person(); //インスタンスとしてオブジェクトを生成
        taro.setProfile("蒲田太郎", 20); //オブジェクトのメソッドの呼び出し
        taro.printProfile(); //オブジェクトのメソッドの呼び出し
    }
}

/*
class Person{
    String name;
    int age;
    void setName(String arg_name){
        this.name = arg_name; //左辺のthis.nameはインスタンス変数、右辺のarg_nameはメソッドの引数
    }
    void setAge(int arg_age){
        this.age = arg_age; //左辺のthis.ageはインスタンス変数、右辺のarg_ageはメソッドの引数
    }
    String getName(){
        return name; //thisはないが、より内側であるメソッドの引数が存在しないのでインスタンス変数
    }
    int getAge(){
        return age; //thisはないが、より内側であるメソッドの引数が存在しないのでインスタンス変数
    }
}
*/

class Person{
    String name;
    int age;
    void setProfile(String arg_name, int arg_age){
        this.name = arg_name; //左辺のthis.nameはインスタンス変数、右辺のarg_nameはメソッドの引数
        this.age = arg_age; ; //左辺のthis.ageはインスタンス変数、右辺のarg_ageはメソッドの引数
    } /* 本当なら、メソッドの引数は変数と同じにするべき。 (Srting nameに指定してthis.name = name) */
    void printProfile(){
        //thisはないが、 name,ageはより内側であるメソッドの引数が存在しないのでインスタンス変数
        System.out.println(name + "さんは" + age + "歳です。");
    }
}