public class Student{
    // 類別屬性
    public static String schoolName = "ABC High School";

    // 物件屬性
    private String name;
    private int score;
    
    // 建構子
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    // 方法：印出資訊
    public void printInfo(){
        System.out.println("姓名：" + name + ", 分數：" + score + ", 學校：" + schoolName);
    }

    // 方法：判斷是否及格
    public boolean isPassed(){
        return score >= 60;
    }
    
    // 類別方法
    public static double calculateAverage(Student[] students){
        int sum = 0;
        for(Student s : students){
            sum += s.score;
        }
        return sum / students.length;
    }

    // 類別方法：findTopStudent(Student[] students)
    public static Student findTopStudent(Student[] students){
        Student top = students[0];
        for(Student s : students){ 
            if(s.score > top.score){
                top = s;
            }
        }
        return top;
    }


    // 主程式
    public static void main(String[] args){
        Student s1 = new Student("Alice", 85);
        Student s2 = new Student("Bob", 54);
        Student s3 = new Student("Charlie", 70);

        s1.printInfo();
        System.out.println("及格嗎？" + s1.isPassed());

        s2.printInfo();
        System.out.println("及格嗎？" + s2.isPassed());

        s3.printInfo();
        System.out.println("及格嗎？" + s3.isPassed());

        Student[] students = {s1, s2, s3};
        System.out.println("平均分數：" + Student.caculateAverage(students));
    }
}