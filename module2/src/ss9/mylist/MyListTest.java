package ss9.mylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList<Integer>();

        myList.add(0, 5);
        myList.add(2, 7);
        myList.add(3, 9);

        System.out.println(myList.get(3));
        System.out.println(myList.remove(2));
    }
}
