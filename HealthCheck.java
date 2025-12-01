public class HealthCheck{
    public static void main(String[] args) {
        // 模擬使用者輸入的資料
        int age = 28;
        double weight = 68.0;
        double height = 1.75;
        boolean exercise = true;

        // 計算 BMI
        double bmi = weight / (height * height);

        // 請在這裡加入條件判斷與輸出結果
        // TODO: 根據題目條件輸出不同訊息
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("你的狀態良好，請繼續保持！");
        } else if ((bmi < 18.5 || bmi > 24.9) && exercise == true) {
            System.out.println("雖然體重不在標準範圍，但有運動是好事！");
        } else if (!exercise || age > 60) {
            System.out.println("建議多運動並定期健康檢查！");
        } else {
            System.out.println("注意飲食與作息");
        };
    }
}