package chap03;

public class NaNInfinitySample {
    public static void main(String[] args) {
        double a = 10;
        double b = 0;

        System.out.println(a / b);  // Infinity
        System.out.println(a % b);  // NaN

        System.out.println(Double.isInfinite(a/b));
        System.out.println(Double.isNaN(a%b));

    }
}
