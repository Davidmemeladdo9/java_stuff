package LinkedList;

// import java.lang.reflect.Array;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        var list = new LinkedLists();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.toString());
        System.out.println(list.contains(60));
    }
}
