package circularlinkedlist;

class Circular {
    private Node head;
    private Node tail;

    Circular() {
        this.head = null;
        this.tail = null;
    }

    void addNode(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            tail.setRight(node);
            node.setLeft(tail);
        }
        tail = node;
        tail.setRight(head);
        head.setLeft(tail);
    }

    void displayR(){
        Node current = head;
        while(current != head.getLeft()){
            System.out.print(current.getData()+" ===> ");
            current = current.getRight();
        }
        System.out.println(current.getData() + "===>" + current.getRight().getData());
    }

    void displayL(){
        Node current = head;
        while (current != head.getRight()) {
            System.out.print(current.getData() + " <=== ");
            current = current.getLeft();
        }
        System.out.println(current.getData() + "<===" + current.getLeft().getData());
    }
}
