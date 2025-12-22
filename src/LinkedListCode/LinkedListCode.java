package LinkedListCode;


class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;

    }
}
public class LinkedListCode {
    public static void main(String[] args) {
        Node head = new Node(1);
        System.out.println(head.data);
        System.out.println(head.next);
    }
}
