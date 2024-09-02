package chap02.casting;

public class ForceCastingQuiz {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String stringValue = "A";

        // 강제타입 변환
        double var1 = (double) intValue; // int를 double로 변환
        byte var2 = (byte) intValue;     // int를 byte로 변환 (손실 가능성 있음)
        int var3 = (int) doubleValue;    // double을 int로 변환 (소수점 이하 손실됨)

        // 문자열 값은 Char 타입으로 변경이 불가능하다.
        // char var4 = (char) stringValue;
        // 가능한 방법으로는 charAt(index) 라는 메서드를 사용해야 한다.
        char changedValue = stringValue.charAt(0); // 문자열의 첫 번째 문자 추출

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(changedValue);


    }
}
