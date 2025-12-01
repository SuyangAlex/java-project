public class Loop{
    public static void main(String[] args){
        // while 迴圈
        while(true){
            System.out.println("Loop");
        }

        // 可以被控制運作次數的迴圈
        int x = 2;
        while(x <= 6){
            System.out.println(x);
            x++;
        }


        // 計算 1+2+3+4+5 的總和
        int total = 0;
        int n = 1;
        while(n<=5){
            total += n;
            n++;
        }
        System.out.println(total);
        

        // for 迴圈
        int total = 0;
        for(int n=1;n<=5;n++){
            total += n;
        }
        System.out.println(total);
    }
}