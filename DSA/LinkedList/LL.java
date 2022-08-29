package LinkedList;

public class LL {

    private Node head;
    public  LL(){
        int size = 0;
    }


    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

    }

    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(int val,int index)
    {
        if (index == 0)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }


    public void deleteFirst()
    {
        if(head.next == null)
        {
            head = null;
        }
        head = head.next;
    }

    public void deletLast()
    {
        Node first = head.next;
        Node second = head;
        while(first.next != null)
        {
            first = first.next;
            second = second.next;
        }
        second.next = null;
    }

    public void delete(int index)
    {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }


    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    private class Node{
        int value;
        Node next;


        public Node(int value)
        {
            this.value = value;
        }
    }
}
