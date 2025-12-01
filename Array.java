import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        // 陣列的基本操作
        int[] grades = new int[]{64, 78, 46};
        System.out.println(grades.length);
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        grades[0] = 78;
        grades[1] = 98;
        grades[2] = 100;

        for(int n=0;n<grades.length;n++){
            System.out.println(grades[n]);
        }

        // 輸入學生的數量，以及每位學生的成績，計算平均數
        System.out.print("請輸入有幾位學生：");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[] scores = new int[number];

        System.out.println("請逐一輸入學生的成績");
        for(int n=0; n<scores.length; n++){
            System.out.print("第"+(n+1)+"位學生的成績：");
            scores[n] = s.nextInt();
        }

        int total = 0;
        for(int i=0; i<scores.length; i++){
            total += scores[i];
        }
        int average = total / scores.length;
        System.out.println("平均成績是：" + average);
    }
}