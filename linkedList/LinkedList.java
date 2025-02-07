package linkedList;

class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else tail.setNext(newNode);

        tail = newNode;
    }

    public void display(){
        Node current = head;
        while(current!=null){
            current.display();
            current = current.getNext();
        }
    }

}
