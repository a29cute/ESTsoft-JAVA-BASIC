package chap04;

public class WhileLoop {
    public static void main(String[] args) {
        int index = 1;
        while (index <= 10) {
            System.out.println("나무를 " + index + "번 찍었습니다.");
            index++;
        }
        System.out.println("나무가 넘어갑니다.");
    }
}
