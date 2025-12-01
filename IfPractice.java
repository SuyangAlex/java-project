import java.util.Scanner;
public class IfPractice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("請輸入身高(公尺)：");
        double height = input.nextDouble();
        
        System.out.print("請輸入體重(公斤)：");
        double weight = input.nextDouble();

        double bmi = weight / (height*height);
        System.out.println("你的BMI為："+ bmi);

        if(bmi<=18.5){
            System.out.println("體重過輕");
        }else if(18.5<bmi && bmi<=24){
            System.out.println("體重正常");
        }else if(24<bmi && bmi<=27){
            System.out.println("體重過重");
        }else{
            System.out.println("肥胖");
        }
    }
}