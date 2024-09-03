package chap03;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------------");
        x++; // 10
        ++x; // 12
        System.out.println("x=" + x);

        System.out.println("----------------------");
        y--; // 10
        --y; // 8
        System.out.println("y=" + y);

        System.out.println("----------------------");
        z = x++; // z = 12, x = 13
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("----------------------");
        z = ++x; // x = 14, z = 14
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("----------------------");
        z = ++x + y++; // z=23, x=15, y=9
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}