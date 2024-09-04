package chap04;

import java.util.ArrayList;

public class forloopExample2 {
    /* for each 반복문 */
    public static void main(String[] args) {
        String[] number = {"1","2","3","4","5"};
        for(String num : number) {
            System.out.println(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int num : list) {
            System.out.print(num);
        }
    }
}
