import java.io.PrintWriter;
class AppWriter{
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter("./data.txt");
        writer.println("Hello World");
        writer.print("Second Line");
        writer.println("Third Line");
        writer.println("大家好");
        writer.flush();
        writer.close();
    }
}