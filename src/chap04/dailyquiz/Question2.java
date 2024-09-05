package chap04.dailyquiz;

public class Question2 {
    public static void main(String args[]) {
        int[] array = {12, 4, 7, 20, 1};
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }

        double avg = (double)sum / array.length;

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("평균: " + avg);
    }
}
