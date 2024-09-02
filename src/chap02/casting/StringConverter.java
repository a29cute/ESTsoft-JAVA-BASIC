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
        String str2 = "10000000000";
        long primitiveLong = Long.parseLong(str2);
        Long wrapperLong = Long.valueOf(str2);

        System.out.println(primitiveLong);
        System.out.println(wrapperLong);

        // String → float/Float
        String str3 = "1000000.985";
        float primitiveFloat = Float.parseFloat(str3);
        Float wrapperFloat = Float.valueOf(str3);

        System.out.println(primitiveFloat);
        System.out.println(wrapperFloat);

        // String → double/Double
        String str4 = "1000000.985";
        double primitiveDouble = Double.parseDouble(str4);
        Double wrapperDouble = Double.valueOf(str4);

        System.out.println(primitiveDouble);
        System.out.println(wrapperDouble);

    }
}
