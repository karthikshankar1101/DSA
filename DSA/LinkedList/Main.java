package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(77);
        list.insertFirst(98);
        list.insertFirst(87);
        list.insertFirst(34);


        list.insertLast(11);
        list.insertLast(12);
        list.insertLast(13);
        list.insertLast(14);


        list.insert(100,2);

        list.display();
        System.out.println();
     //   list.deleteLast();

        list.delete(3);
        list.display();

    }
}
