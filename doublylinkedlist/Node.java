package doublylinkedlist;

class Node {
    private int data;
    private Node next;
    private Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    int getData() {return this.data;}

    Node getNext() {return this.next;}

    Node getPrev() {return this.prev;}

    void setNext(Node next) {this.next = next;}

    void setPrev(Node prev) {this.prev = prev;}

}
