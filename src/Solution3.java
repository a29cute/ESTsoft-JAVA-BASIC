import java.util.Arrays;

public class Solution3 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        int[] solution = solution(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                int result = arr[i] / 2;
                arr[i] = result;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                int result = arr[i] * 2;
                arr[i] = result;
            }

        }
        return arr;
    }
}
