package chap04;

import java.util.ArrayList;

public class forloopExample3 {
    /* continue 이해 */
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            if(i%3!=0){
                continue;
            }
            System.out.println(i);
        }
    }

}
