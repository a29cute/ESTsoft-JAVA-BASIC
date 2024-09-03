package chap03;

public class Sample {
    public static void main(String[] args) {
        // 단항 연산자
        int x = 14;
        int result = x++;  // x의 현재 값 14가 result에 할당됨
                            // 그 후 x가 1 증가하여 15가 됨
        System.out.println(result);  // result는 14
        System.out.println(x);       // x는 15

    }
}
