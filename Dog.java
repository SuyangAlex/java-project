package data;
public class Dog extends Animal implements Renderable{
    private String name;
    public Dog(String name){
        super("Dog");
        this.name = name;
    }
    public void render(){
        System.out.println("I'm a "+ this.type + ". My name is " + this.name);
    }
}