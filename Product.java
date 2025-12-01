package data;
public abstract class Product{
    protected String SN;
    protected String brand;
    protected String name;
    public Product(String SN, String brand, String name){
        this.SN = SN;
        this.brand = brand;
        this.name = name;
    }

    public void render(){
        System.out.println(
            this.SN + "," +
            this.brand + "," +
            this.name
        );
    }
    
    public abstract int getPrice(); // 宣告成抽象方法，讓程式能夠多型
}