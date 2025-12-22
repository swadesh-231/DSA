package LinkenList;


public class Implementation {
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = tail = temp;
            }
            tail.next = temp;
            tail = temp;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.display();
    }
}
