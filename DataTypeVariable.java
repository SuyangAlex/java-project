public class DataTypeVariable { // DataTypeVariable 叫做類別名稱，必須和檔名一模一樣
    public static void main(String[] args){
        // 在終端機印出各種資料型態的資料

        // 整數，預設是 int 型態
        int x;
        x = 3;
        System.out.println(x);
        x = 120;
        System.out.println(x);

        // 長整數：數字的後面特別加上 L
        long y = 50000000000L; // 在後面加上 L
        System.out.println(y);

        // 浮點數：預設為 double 雙精度浮點數
        double m = 3.14159268;
        System.out.println(m);
        // 單精度浮點數，數字的後面特別加上 F，精準度只到小數點第七位數
        float n = 3.14159268F; // 在後面加上 F
        System.out.println(n);
        
        // 布林值
        boolean b = true;
        System.out.println(b);

        // 字元：只能包一個字元
        char c = '嗨';
        System.out.println(c);

        // 字串：可以包含 0~多個 字元
        String s = "Hello";
        System.out.println(s);
    }
}
