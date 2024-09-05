package chap05;

public class StringQuestion {
    public static void main(String[] args) {
        /**
         * Q1. "aaaabbccd"문자열 한 글자씩 출력하기
         */
        String hello = "aaaabbccd";
        for (int i = 0; i < hello.length(); i++) {
            System.out.println(hello.charAt(i));
        }

        /**
         * Q2. 단어 순서 뒤집기
         */
        String str = "Hello Welcome Java";
        String[] words = str.split(" ");
        String temp = words[0];
        words[0] = words[2];
        words[2] = temp;
        String result = String.join(" ", words);
        System.out.println(result);

        /**
         * Q3. 공백 제외해서 하나의 문자로 출력
         */
        String str2 = "   Hello Welcome Java   ";
        System.out.println(str2.replace(" ", ""));
    }
}
