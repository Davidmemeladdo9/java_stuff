package DoublyLinkedList;

public class LinkedList {

    private NodeElement head;
    // private NodeElement tail;
    private int size;

    public LinkedList(){
        head=null;
        // tail = null;
        size=0;
    }

    // public void add(int data){
    //     if(head==null){
    //         head = new NodeElement(data);
    //         tail = head;
    //     }else{
    //         tail.setNext(new NodeElement(data));
    //         tail = tail.getNext();
    //     }
    //     size++;
    // }

    public void add(int data){
        NodeElement newNode = new NodeElement(data);
        if (head==null){
            head=newNode;
        }else{
            NodeElement current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public int size(){
        return size;
    }

    // create a method to print the list
    public void print(){
        NodeElement current = head;
        while(current!=null){
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println();
    }
    // Create a method to print a list in reverse
    public void printReverse(){
        NodeElement current = head;
        while(current!=null){
            current = current.getNext();
        }
        while (current != null){
            System.out.println(current.getData());
            current = current.getPrev();
        }
        System.out.println();
    }



    // Main method.
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        // list.print();
        list.printReverse();
    }
}

class NodeElement{

    int data;
    NodeElement next;
    NodeElement prev;

    NodeElement(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){

    }

    public NodeElement getNext(){
        return next;
    }

    public void setNext(NodeElement next){
        this.next=next;
    }
    public NodeElement getPrev(){
        return prev;
    }

    public void setPrev(NodeElement prev){
        this.prev = prev;
    }

}