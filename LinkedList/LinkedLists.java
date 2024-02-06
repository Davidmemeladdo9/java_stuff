package LinkedList;

import java.util.NoSuchElementException;

public class LinkedLists {
    //  The class Node was taken from the other file and copied here
    private class Node {   

        private int  value;
        private Node next;

        public Node(int value){
            this.value= value;
        }
    }
    //The nodes are made private so that they can only be accessed within a class
    private Node first;
    private Node  last;

    public void addLast(int item){
        Node node =new Node(item);
        // node.value = item;
        if (first==null){
            first =last=node;
        }else{
            last.next=node;
            last =node;
        }
    }
    public void addFirst(int item){
        Node node = new Node(item);

        if (first== null){
            first=last=node;
        }else{
            node.next = first;
            first = node;
        }
    }
    public int indexOf(int item){

        int index = 0;
        var current = first;
        while(current != null){
            if (current.value==item){
            return index;
            }else{
                current=current.next;
                index++;
            }   
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item)!=-1;
    }
    public void removeFirst(){
        if (first==null){
            throw new NoSuchElementException();
        }
        if(first==last){
            first= last = null;
            return;
               
        }else{
            var second =first.next;
            first.next=null;
            first =second;  
        }

    }
    public void removeLast(){
        // [10 -> 20 -> 30]
        // previous -> 20
        // last -> 20
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }
    private Node getPrevious(Node node){
        var current = first;

        while (current != null){
            if(current.next == node) return current;
            current =current.next;
        }
        return null;
    }
}
