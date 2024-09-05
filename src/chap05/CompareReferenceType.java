package chap05;

public class CompareReferenceType {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass outerObj2 = new OuterClass();

        System.out.println(outerObj==outerObj2);

        // 다른 메모리를 참조
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);

        // 같은 메모리를 참조
        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println(str3 == str4);
    }
}
