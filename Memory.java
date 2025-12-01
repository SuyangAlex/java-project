package data;
public class Memory extends Product{
    private int size; // 記憶體有多少 GB
    public Memory(
        String SN, 
        String brand, 
        String name, 
        int size)
        {
        super(SN, brand, name);
        this.size = size;
    }
        public int getPrice(){
            return this.size*1000;
        }
}