package chap02;

public class VariableExample2 {
    public static void main(String[] args) {
        int a = 1;

        //long 타입 변수에 int 값을 대입할 때 컴파일러가 자동으로 int를 long으로 변환
        long value = 100;

        // long value2 = 10000000000; // 초과된 타입은 컴파일러가 변환하지 않는다.
        long value2 = 10000000000L; // L 또는 l 접미사를 사용해야 long 타입으로 인식됨


        // 리터럴 명시X
        int intValue = 10; // int 리터럴 (기본적으로 int 타입)
        double doubleValue = 3.14; // double 리터럴 (기본적으로 double 타입)

        // 리터럴 명시 필수
        long longValue = 10000000000L; // long 리터럴 (L 접미사로 long 타입으로 명시)
        float floatValue = 3.14F; // float 리터럴 (F 접미사로 float 타입으로 명시)

    }
}
