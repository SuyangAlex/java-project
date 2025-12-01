public class Operator{
    public static void main(String[] args){
        // 算術運算
        int x = 3+4;
        System.out.println(x);
        int y = 3/4;
        System.out.println(y);
        double m = 5/2.0; // 因為除數是 double 型態，所以計算出的答案是 double，建立變數時就應該要定義相同型態
        System.out.println(m);
        double z = 5%3.5;
        System.out.println(z);
        
        // 指定運算
        int x = 5;
        x+=2; // x = x+2;
        System.out.println(x);
        int y = 3;
        y += 2; // y = y+2;
        System.out.println(y);
        
        // 比較運算：結果會是 boolean
        boolean x = 3 > 5;
        System.out.println(x);
        boolean y = 5 <= 5;
        System.out.println(y);
        boolean z = 2!=2;
        System.out.println(z);
        boolean s = "Hello" == "Hello";
        System.out.println(s);

        // 單元運算
        int x = 4;
        x++; // x+=1; // x=x+1;
        System.out.println(x);
        boolean y =! true;
        System.out.println(y);
        

        // 邏輯運算
        boolean x = true && true;
        boolean y = true && false;
        boolean m = false || true;
        boolean n = false || false;
        System.out.println(x);
        System.out.println(y);
        System.out.println(m);
        System.out.println(n);
    }
}