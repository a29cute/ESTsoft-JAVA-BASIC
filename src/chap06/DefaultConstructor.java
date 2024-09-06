package chap06;

public class DefaultConstructor {

    String field;

//    DefaultConstructor(String field) {
//        this.field = field;
//    }

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();

        System.out.println(defaultConstructor.field);
    }
}
