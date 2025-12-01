package data;
public class CPU extends Product implements Renderable{
    private double clockRate; // 時脈 2.4 GHz
    private int coreNumber; // 核心數 4 核心
    public CPU(
        String SN,
        String brand,
        String name,
        double clockRate,
        int coreNumber)
        {
        super(SN, brand, name); // super 關鍵字一定要寫在最前面
        this.clockRate = clockRate;
        this.coreNumber = coreNumber;
    }

    public int getPrice(){
        return this.coreNumber*1000 +
            (int)(this.clockRate*2000);
    }
    public void render(){
        String description = this.SN+", "+
        this.brand+", "+
        this.name+", "+
        this.clockRate+", "+
        this.coreNumber;
        
        System.out.println(description);
    }
}