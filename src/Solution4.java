import java.util.Arrays;

public class Solution4 {


    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {5, 2, 1, 7, 5};

        int[] solution1 = solution(arr1);
        int[] solution2 = solution(arr2);

        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] num_list) {
        int[] arrResult = new int [num_list.length + 1];

        for(int i = 0; i < num_list.length; i++){
            arrResult[i] = num_list[i];

        }

        int lastValue = num_list[num_list.length - 1]; // 마지막 원소
        int secondlastValue = num_list[num_list.length - 2]; // 마지막에서 두번째 원소

        if (lastValue > secondlastValue) {
            int result = lastValue - secondlastValue;
            arrResult[arrResult.length - 1] = result;

        } else {
            int result = lastValue * 2;
            arrResult[arrResult.length - 1] = result;
        }

        return arrResult;
    }
}
