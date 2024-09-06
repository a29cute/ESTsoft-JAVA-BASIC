package chap06;

/**
    * 이전 코드: 기본 데이터 타입을 매개변수로 사용하고, 메소드가 값을 증가시킨 후 반환합니다.
                객체의 상태를 변경하지 않습니다.
    * 현재 코드: 객체를 매개변수로 사용하고,
                객체의 필드를 직접 수정하여 객체의 상태를 변경합니다.
    */

public class Calculator2 {
    int a; // 필드(인스턴스 변수)

    Calculator2(int a) {
        this.a = a; // 생성자를 통해 필드를 초기화
    }

    // Calculator2 객체를 매개변수로 받아서 객체의 필드를 증가시키는 메소드
    void postfixOperator(Calculator2 cal) {
        cal.a++;
    }

    /* Calculator cal 객체를 매개변수로 전달 -> 객체의 필드를 수정*/
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2(1);
        calculator.postfixOperator(calculator); // 주소값 복사
        System.out.println(calculator.a);
    }


}