package chap02.casting;

public class AutoBoxingExample2 {
    public static void main(String[] args) {
        long startTimeMs = System.currentTimeMillis();
        Integer sum1 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum1 = sum1 + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");

        int sum2 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum2 = sum2 + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");


    }
}
