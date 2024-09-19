package chap10.whildcard;

public class WildCardExample {
    // 매개변수 전체 해당하는 와일드 카드(? : 어떤 타입이든 들어올 수 있다.)
    public static void registerPerson(Course<?> t){

    }

    public static void registerPerson2(Course<? extends Student> t){

    }

    public static void registerPerson3(Course<? super Worker> t){

    }

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

        registerPerson(personCourse);
        registerPerson(studentCourse);
        registerPerson(highStudentCouse);
        registerPerson(workerCourse);

        registerPerson2(studentCourse);
        registerPerson2(highStudentCouse);

        registerPerson3(workerCourse);
        registerPerson3(personCourse);

    }
}
