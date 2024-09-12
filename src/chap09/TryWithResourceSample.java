package chap09;

public class TryWithResourceSample {
    public static void main(String[] args) {
        try (FileStream stream = new FileStream("file.text")){
            stream.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("완료");
        }
    }
}
