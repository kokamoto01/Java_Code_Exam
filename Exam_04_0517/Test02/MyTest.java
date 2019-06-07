public class MyTest{
    public static void main(String args[]){
    Student taro = new Student(); //サブクラスのオブジェクトを生成
    taro.setProfile("蒲田太郎", 20, "日本工学院専門学校"); //サブクラスのメソッドの呼び出し
    taro.printProfile(); //サブクラスのメソッドの呼び出し
    }
    }
    class Person{
        protected String name; //サブクラスからアクセスされるためprotected
        protected int age; //サブクラスからアクセスされるためprotected
        }
        class Student extends Person{ //Personクラスを継承してStudentクラスを定義
        private String school; //自クラスからのアクセスのみのためprivate
        void setProfile(String name, int age, String school){
        super.name = name;
        super.age = age;
        this.school = school;
        }
        void printProfile(){
        System.out.println(name + "さんは" + age + "歳です。" + school + "に通っています。");
        }
        }