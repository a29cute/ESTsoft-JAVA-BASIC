package chap01;

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {

        // 주석 작성법1 ctrl+/
        /* 주석 작성법2 ctrl+shift+/ */

        // 주석은 최대한 생략하고 메소드명, 변수명으로 네이밍을 잘 짓는 것이 좋다.
        System.out.println("Hello World");

        HashMap map = new HashMap(); // 변수 선언
        map.put("key1", "value1");


        // 변수는 반드시 초기화 해야된다.
        int value = 0;
        System.out.println(value);

    }
}
