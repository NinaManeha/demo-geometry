package by.itacademy.ninamaneha.javabasics;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);

        Box mybox2 = new Box();
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}
