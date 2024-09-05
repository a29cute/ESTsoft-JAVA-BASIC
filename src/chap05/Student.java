package chap05;

public class Student {
    /* 클래스 변수와 인스턴스 변수는 이 공간에 작성합니다. */
    static int totalStudent = 30; // 클래스 변수
    int score; // 인스턴스 변수

    public Student(int score) { // 생성자
           this.score = score;
    }
}
