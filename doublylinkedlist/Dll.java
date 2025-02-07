package doublylinkedlist;

class Dll {
    private Node head;
    private Node tail;

    Dll(){
        this.head = null;
        this.tail = null;
    }
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
    }

    void displayF(){
        Node temp = head;
        while(temp != null){
            if(temp.getNext() == null){
                System.out.print(temp.getData());
            }else{
                System.out.print(temp.getData() + " -> ");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }

    void displayB(){
        Node temp = tail;
        while(temp != null){
            if(temp.getPrev() == null){
                System.out.print(temp.getData());
            }else{
                System.out.print(temp.getData() + " <- ");
            }

            temp = temp.getPrev();
        }
        System.out.println();
    }
}
