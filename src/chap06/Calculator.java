package chap06;

public class Calculator {
    int postfixOperator(int a) {
        a++; // a의 값을 1 증가시킵니다.
        return a; // 증가된 a의 값을 반환합니다.
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int result = calculator.postfixOperator(a); // 메소드 호출 결과를 result 변수에 저장합니다.
        System.out.println(result); // 증가된 값인 2를 출력합니다.
    }
}
