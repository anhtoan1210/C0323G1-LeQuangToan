package ss9.mylist;

public class Mylist<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Mylist(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E elements) {

    }
}
