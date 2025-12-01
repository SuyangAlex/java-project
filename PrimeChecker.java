public class PrimeChecker{
    public static void main(String[] args){
        int testNumber = 8;
        System.out.println(testNumber + " 是質數嗎？" + isPrime(testNumber));
    }
    
    public static boolean isPrime(int number){
        // 排除小於 2 的數字
        if(number < 2){
            return false;
        }

        // 使用 for 迴圈檢查是否有其他因素
        for(int i=2; i<= number/2; i++){
            if(number % i == 0){
                return false;
            }
        }

        // 無法被其他數整除，就是質數，回傳 true
        return true;
    }
}