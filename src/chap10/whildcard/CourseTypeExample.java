package chap10.whildcard;

public class CourseTypeExample {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>();
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>();
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>();
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCouse = new Course<>();
        highStudentCouse.add(new HighStudent("고등학생"));

    }
}
