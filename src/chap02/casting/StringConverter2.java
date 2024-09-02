package chap02.casting;

public class StringConverter2 {
    public static void main(String[] args) {
        // int → String
        int intValue = 10;
        String strValue1;
        String strValue2;
        String strValue3;

        strValue1 = String.valueOf(intValue);
        strValue2 = Integer.toString(intValue);
        strValue3 = "" + intValue;

        System.out.println(strValue1);
        System.out.println(strValue2);
        System.out.println(strValue3);

    }
}
