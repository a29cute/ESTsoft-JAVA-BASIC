package coding;

import java.util.Arrays;

public class Solution2_practice {


    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;

        int[] solution = solution(start_num, end_num);

        System.out.println("Arrays.toString(solution)= " + Arrays.toString(solution));
    }

    public static int[] solution(int start_num, int end_num) {

        int[] answer = new int[end_num - start_num + 1]; // 8개
        int count = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[count] = i;
            count++;
        }

        return answer;
    }
}
