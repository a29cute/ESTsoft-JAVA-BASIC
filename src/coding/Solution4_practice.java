package coding;

import java.util.Arrays;

public class Solution4_practice {


    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {5, 2, 1, 7, 5};

        int[] solution1 = solution(arr1);
        int[] solution2 = solution(arr2);

        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] num_list) {
        int[] new_num_list = new int[num_list.length + 1];
        int length = num_list.length;
        for(int i = 0; i < num_list.length ; i++){
            new_num_list[i] = num_list[i];
        }
        int last;
        if(num_list[length-1] > num_list[length-2]){
          last = num_list[length - 1] - num_list[length - 2];
        } else {
            last = num_list[length - 1] * 2;
        }

        new_num_list[length] = last;

        return new_num_list;
    }
}
