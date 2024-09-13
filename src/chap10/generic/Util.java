package chap10.generic;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.setObject(t);

        return box;
    }
}
