package chap02.casting;

public class StringConverter {
    public static void main(String[] args) {
        // String → int/Integer
        String str1 = "12345";
        int intValue = Integer.parseInt(str1);
        Integer integerValue = Integer.valueOf(str1);

        System.out.println(intValue);
        System.out.println(integerValue);

        // String → long/Long
        String str2 = "10000000000";             // 100억 숫자값으로 입력
        long strTolong = Long.parseLong(str2);   // primitive Type (long)으로 변환
        Long strToLong = Long.valueOf(str2);    // Wrapper class (Long)으로 변환

        System.out.println(strTolong);
        System.out.println(strToLong);

        // String → float/Float
        String str3 = "1000000.985";
        float floatType = Float.parseFloat(str3);
        Float strToFloat = Float.valueOf(str3);

        System.out.println(floatType);
        System.out.println(strToFloat);

        // String → double/Double
        String str4 = "1000000.985";
        double doubleType = Double.parseDouble(str4);
        Double strToDouble = Double.valueOf(str4);

        System.out.println(doubleType);
        System.out.println(strToDouble);

    }
}
