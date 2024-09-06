package chap06;

public class Calculator {
    int postfixOperator(int a) {
        a++;
        return a;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int result = calculator.postfixOperator(a);
        System.out.println(result);
    }
}
