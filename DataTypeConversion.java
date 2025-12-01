public class DataTypeConversion {
    public static void main(String[] args){
        // 數字型態間的轉換
        // 數字型態範圍大小的排序： double > float > long > int > short > byte
        // 小範圍轉換到大範圍：自動轉換
        
        byte x = 3;
        int y = x; // byte 轉換成 int
        System.out.println(y);
        
        long z = y; // int 轉換成 long
        System.out.println(z);

        double d = z; // long 轉換成 double
        System.out.println(d);
        

        

        // 大範圍轉換到小範圍：需要使用（資料型態）做強制轉換
        int x = 1024;
        // byte y = x; // 錯誤：試圖把 int 轉換成 type -> 可能會失真
        byte y = (byte)x;
        System.out.println(y);

        long z = 102400;
        int m = (int)z; // 錯誤：試圖把 long 轉換成 int （大範圍轉換成小範圍）
        System.out.println(m);

        // float f = 3.141592689; // 錯誤：因為程式會先預設小數為 double 型態，故這行指令試圖把 double 轉換成 float
        float f = (float)3.141592689;
        System.out.println(f);
        
        


        
        // 字串轉換成數字
        String text = "34";
        int x = Integer.parseInt(text);
        System.out.println(x);

        text = "3.1415";
        double d = Double.parseDouble(text);
        System.out.println(d);
        

        
        // 數字轉換成字串
        int x = 345;
        String s = String.valueOf(x);
        System.out.println(s);
        
        long l = 9999999;
        s = String.valueOf(l);
        System.out.println(s);

        s = String.valueOf(3.14159F);
        System.out.println(s);
    }
}
