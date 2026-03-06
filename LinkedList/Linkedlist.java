class Linkedlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void insertatbegining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertatbegining(10);
        list.insertatbegining(20);
        list.insertatbegining(30);

        // ✅ You forgot this line:
        list.display();
    }
}
