package chap05;

public class OuterClass {
    public static void main(String[] args) {
        // 클래스 변수는 클래스 이름을 통해 직접 접근할 수 있습니다.
        System.out.println("전체 학생 수: " + Student.totalStudent);

        // 인스턴스 변수는 객체를 생성한 후 객체를 통해 접근해야 합니다.
        Student student1 = new Student(90);
        Student student2 = new Student(80);
        Student student3 = new Student(70);

        System.out.println("학생 1의 점수: " + student1.score);
        System.out.println("학생 2의 점수: " + student2.score);
        System.out.println("학생 3의 점수: " + student3.score);
    }
}
