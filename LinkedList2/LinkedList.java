package LinkedList2;

// Implement a singly linked list

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
        NodeElement node = new NodeElement(data);
        if (head==null){
            head=node;
        }else{
            NodeElement current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(node);
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
    // Main method.
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(90);
        list.print();
    }
}

class NodeElement{

    int data;
    NodeElement next;

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

}
