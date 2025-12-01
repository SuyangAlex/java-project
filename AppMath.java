import java.lang.Math;
class AppMath{
    public static void main(String[] args){
        int ans = Math.abs(-3);
        System.out.println(ans);
        double num = Math.floor(3.875);
        System.out.println(num);

        num = Math.round(3.499);
        System.out.println(num);

        double n = Math.random(); // 0~1 random number
        System.out.println(Math.round(100*n));
    }
}