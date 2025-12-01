package data;
public class Person{
    // 物件屬性
    public String name = "Suyang";
    public int age = 27;
    // 物件方法
    public void talk(){
        System.out.println("Hi 我是" + this.name + "，我今年" + this.age + "歲。");
    }
    // 物件建構式
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    };

    public Person(){

    };
}