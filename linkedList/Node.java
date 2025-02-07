package linkedList;

class Node {
    private int data;
    private Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public void display() {
        if (next == null) {
            System.out.println(this.data);
        } else {
            System.out.print(this.data + " ===> ");
        }
    }
}