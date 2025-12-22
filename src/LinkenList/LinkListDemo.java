package LinkenList;


class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkListDemo {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        display(a);
        System.out.println();
        disPlayRecursive(a);
        System.out.println();
        displayReverse(a);
        System.out.println();
        System.out.println(length(a));
    }
    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    static void disPlayRecursive(Node head) {
        if (head == null) {return;}
        System.out.print(head.data+" ");
        disPlayRecursive(head.next);
    }
    static void displayReverse(Node head) {
        if (head == null) {return;}
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    static int length(Node head) {
        if (head == null) {return 0;}
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
