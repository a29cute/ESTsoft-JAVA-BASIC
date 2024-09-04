package chap04;

public class ArrayExample {
    public static void main(String[] args) {
        // String[] 문자열 배열 선언, 값 저장
        String[] arrayString = new String[2]; // new 키워드를 이용하여 String 객체 생성
        arrayString[0] = "첫번째";
        arrayString[1] = "두번째";
        System.out.println(arrayString[0]);

        // 배열과 초기값 동시 선언
        String[] arrayString2 = {"첫번째","두번째"};
        System.out.println(arrayString2[1]);
        // System.out.println(arrayString2[2]);
        // ArrayIndexOutOfBoundsException 발생
    }

}
