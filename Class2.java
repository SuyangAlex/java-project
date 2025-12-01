public class Class2 extends Class1{
    private int number;
    public Class2(String text, int number){
        super(text);
        this.number = number;
    }
    public void render(){
        System.out.println(this.text + "," + this.number);
    }
}