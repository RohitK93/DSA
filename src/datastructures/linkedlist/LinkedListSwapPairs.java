package datastructures.linkedlist;

public class LinkedListSwapPairs {

    //   +===================================================+
    //   |               WRITE YOUR CODE HERE                |
    //   | Description:                                      |
    //   | - Swaps every two adjacent nodes in the linked    |
    //   |   list.                                           |
    //   | - The method modifies the list in place.          |
    //   |                                                   |
    //   | Behavior:                                         |
    //   | - A dummy node is used to simplify swapping the   |
    //   |   first pair.                                     |
    //   | - In each iteration, two nodes (`first` and       |
    //   |   `second`) are swapped by adjusting pointers.    |
    //   | - The `previous` pointer helps reconnect the      |
    //   |   swapped pairs to the rest of the list.          |
    //   | - The `first` pointer then moves forward two      |
    //   |   nodes at a time.                                |
    //   | - At the end, `head` is updated to point to the   |
    //   |   new first node.                                 |
    //   +===================================================+


    public static void swapPairs(LinkedList linkedList) {
        Node dummy = new Node(0);
        dummy.next = linkedList.head;
        Node previous = dummy;
        Node first = linkedList.head;

        while (first != null && first.next != null) {
            Node second = first.next;

            // Perform the swap
            previous.next = second;
            first.next = second.next;
            second.next = first;

            // Move pointers
            previous = first;
            first = first.next;
        }

        linkedList.head = dummy.next;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);
        myLinkedList.append(9);

        System.out.println("swapPairs Before: ");
        myLinkedList.printList();

        swapPairs(myLinkedList);

        System.out.println("swapPairs After: ");
        myLinkedList.printList();
    }
}
