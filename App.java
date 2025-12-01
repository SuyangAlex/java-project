import data.*;
class App{
    public static void main(String[] args){
        CPU cpu = new CPU("P01", "A", "CPU X", 2.4, 4);
        App.getDescription(cpu);
        Dog d = new Dog("小黑");
        d.render();
        /*
        Memory memory = new Memory("M01", "G", "Memory X", 32);

        int cpuTotalPrice = App.getTotalPrice(cpu, 2);
        System.out.println(cpuTotalPrice);

        int memoryTotalPrice = App.getTotalPrice(memory, 4);
        System.out.println(memoryTotalPrice);
        */

        /*
        Product product = new Product("A01", "B牌", "3C產品");
        int productTotalPrice = App.getTotalPrice(product, 2);
        System.out.println(productTotalPrice);
        */
    }

    private static void getDescription(Renderable renderable){
        renderable.render();
    }

    private static int getTotalPrice(Product product, int qty){
        return product.getPrice() * qty;
    }
}