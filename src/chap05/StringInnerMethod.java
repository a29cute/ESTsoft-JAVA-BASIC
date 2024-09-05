package chap05;

/**
 * 문자열 내장 메소드 실습
 */
public class StringInnerMethod {
    public static void main(String[] args) {
        String hello = "Hello Java";
        System.out.println(hello.indexOf("J")); // 출력: 6

        System.out.println(hello.replaceAll("Java", "Spring"));
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
        System.out.println(hello.substring(6, 10));
        System.out.println(hello.concat("!"));

        String hello2 = "  Hello Java  ";
        System.out.println(hello2.trim());
    }
}
