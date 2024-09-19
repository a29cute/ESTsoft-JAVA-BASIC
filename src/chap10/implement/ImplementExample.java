package chap10.implement;

public class ImplementExample {
    public static void main(String[] args) {

        StorageImpl<String> storage = new StorageImpl<>(10);
        storage.add("첫번째", 0);
        storage.add("두번째", 1);
        storage.add("세번째", 2);

        String result = storage.get(0);
        System.out.println(result);
    }
}
