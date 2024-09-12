package coding;

public class Solution {


    public static void main(String[] args) {
        int[] num_list1 = {1,2,3,4,5};
        int[] num_list2 = {15, 98, 23, 2, 15};

        int n1 = 3;
        int n2 = 20;
        int solution1 = solution(num_list1, n1);
        int solution2 = solution(num_list2, n2);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] num_list, int n) {
        for (int i : num_list) {
            if (i == n) {
                return 1;
            }
        }
        return 0;
    }
}
