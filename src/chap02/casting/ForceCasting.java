package chap02.casting;

public class ForceCasting {
    public static void main(String[] args) {
        long longValue = 300;
        int intValue1 = (int) longValue;  // intValue는 300이 그대로 저장

        double doubleValue = 3.14;
        int intValue2 = (int) doubleValue;   // intValue는 정수 부분인 3만 저장

        System.out.println(intValue1);
        System.out.println(intValue2);
    }
}
