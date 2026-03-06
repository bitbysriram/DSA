class SearchInLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void Insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;  // ✅ fixed
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");  // ✅ fixed
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SearchInLL list = new SearchInLL();
        list.Insert(30);
        list.Insert(20);
        list.Insert(10);

        list.display();

        int key = 20;
        if (list.search(key)) {
            System.out.println(key + " found in list");
        } else {
            System.out.println(key + " not found in list");
        }
    }
}
