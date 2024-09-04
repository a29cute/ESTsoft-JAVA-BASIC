package chap04;

public class forloopExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) { // if문으로 조건식 추가
                System.out.println(i);
            }
        }

        for (int i = 0; i <= 50; i+=2) { // for문만 이용
            System.out.println(i);
        }
    }
}
