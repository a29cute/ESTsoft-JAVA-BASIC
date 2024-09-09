package chap07.override;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
        child.method2();
        child.method3();

        Parent parent = new Parent();
        parent.method();
        parent.method2();
    }

}
