package chap10.generic;

public class BoxGenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box();
        box.setObject("문자열");
        // 다른 타입값은 입력 불가(컴파일 오류 발생)
        // box.setObject(10);
        String str = box.getObject();
        System.out.println(str);
    }
}
