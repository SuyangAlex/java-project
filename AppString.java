import java.lang.String;
class AppString{
    public static void main(String[] args){
        String s1 = new String("Hello"); // 產生一個字串的物件實體
        int len = s1.length();
        System.out.println(len);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf("ll"));
    }
}