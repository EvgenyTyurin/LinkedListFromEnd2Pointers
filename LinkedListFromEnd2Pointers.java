/**
 *  Print Kth element from end of linked list
 *  Use of two pointers - second start later by k iterations.
 *  When first hits end, second hits Kth place.
 */

public class LinkedListFromEnd2Pointers {

    public static void main(String[] args) {
        // init K
        int k = 2;
        // Init linked list
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(new MyLinkedList.Node(1));
        myLinkedList.add(new MyLinkedList.Node(2));
        myLinkedList.add(new MyLinkedList.Node(3));
        myLinkedList.add(new MyLinkedList.Node(4));
        myLinkedList.add(new MyLinkedList.Node(5));
        System.out.println("List:" + myLinkedList);
        // Pointer 1 starts first
        MyLinkedList.Node pointer1 = myLinkedList.head;
        int pointer1idx = 0;
        // Pointer 2 start later by k iterations
        MyLinkedList.Node pointer2 = myLinkedList.head;
        // Pointers go from start to end of list till pointer 1 hit end
        while (pointer1.next() !=null) {
            pointer1 = pointer1.next();
            pointer1idx++;
            if (pointer1idx > k)
                pointer2 = pointer2.next();
        }
        // Pointer 1 is in Kth position from end now - print it
        System.out.println(k + "th element from end = " + pointer2.getData());
    }

}
