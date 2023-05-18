package ss9.mylist;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E elements) {
        if (size == this.elements.length) {
            ensureCapa();
        }
        this.elements[index] = elements;
        size++;
    }

    public E get(int i) {
        return (E) this.elements[i];
    }

    public E remove(int index){
        if(index > 0 && index <elements.length){
            for (int i = 0; i < size; i++) {
                elements[i]=elements[i-1];
            }
            elements[index] =null;
            size--;
        }
        return (E)elements;
    }


}
