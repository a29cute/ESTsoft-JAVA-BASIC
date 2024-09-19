package chap10.whildcard;

public class Course<T> {
	private T[] array;
	private T[] students;

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}