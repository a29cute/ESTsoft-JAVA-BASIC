package chap08.inherit;

public class InterfaceInheritExample {
    public static void main(String[] args) {
        ImplementsC implC = new ImplementsC();
        implC.methodA();
        implC.methodB();
        implC.methodC();
        System.out.println("---------------");

        InterfaceA interfaceA = implC;
        interfaceA.methodA();
        System.out.println("---------------");

        InterfaceB interfaceB = implC;
        interfaceB.methodB();
        System.out.println("---------------");

        InterfaceC interfaceC = implC;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}