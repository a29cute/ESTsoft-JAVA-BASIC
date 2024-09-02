package chap02.casting;

public class AutoCastingQuiz {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';

        int intValue1 = byteValue;
        int intValue2 = charValue;
        // 오류: char는 short로 자동 변환되지 않음
        // short shortValue = charValue;
        double doubleValue = byteValue;


        System.out.println(intValue1);
        System.out.println(intValue2);
        System.out.println(doubleValue);


    }
}
