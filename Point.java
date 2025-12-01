package math.geometry;
public class Point{
    // 類別的屬性和方法 (static)
    public static int ORIGIN_X = 0;
    public static int ORIGIN_Y = 0;
    public static void renderOrigin(){
        System.out.println(Point.ORIGIN_X + "," + Point.ORIGIN_Y);
    }
    
    // 物件的屬性、方法、建構式 (non-static)
    private int x;
    private int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // 設計 Getters
    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

    void render(){
        System.out.println(this.x + "," + this.y);
    }
}