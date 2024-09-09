package chap07.person;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("길동", "123456-1234567", 1);

		System.out.println("name: " + student.name);	// 부모에게서 물려받은 필드 출력
		System.out.println("ssn: " + student.ssn);		// 부모에게서 물려받은 필드 출력
		System.out.println("studentNo: " + student.studentNo);
	}
}