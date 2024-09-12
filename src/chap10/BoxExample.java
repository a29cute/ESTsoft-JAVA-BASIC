package chap10;

public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("박스 문자열");
        String str = (String) box.getObject();
    }
}
