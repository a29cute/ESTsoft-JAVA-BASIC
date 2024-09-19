package chap10.implement;

public class StorageImpl<T> implements Storage<T> {
    private T[] array;

    public StorageImpl(int capacity) {
        array = (T[])new Object[capacity];
    }

    public void add(T item, int index){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }
}
