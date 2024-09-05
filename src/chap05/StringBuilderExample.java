package chap05;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello World");
        System.out.println(sb1.append("Java!"));

        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.append(" My Name is");
        sb2.append(" Puki!");
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer("Hello World");
        System.out.println(sb3.insert(0, "[0]"));
        System.out.println(sb3.insert(sb3.length(), "!!!"));


        StringBuffer sb4 = new StringBuffer("Hello World");
        String subResult1 = sb4.substring(6);
        String subResult2 = sb4.substring(6, 7);

        System.out.println(subResult1);
        System.out.println(subResult2);
        System.out.println(sb4.indexOf("d"));

    }
}
