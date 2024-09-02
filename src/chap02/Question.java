package chap02;

public class Question {
    public static void main(String[] args) {
        char message = '\uAC00'; // '가'의 유니코드
        System.out.println("출력: " + message);
    }
}
