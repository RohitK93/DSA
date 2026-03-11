package datastructures.doublylinkedlist;

public class DoublyLinkedListPartition {


    public static void partitionList(int x, DoublyLinkedList doublyLinkedList) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Partitions a doubly linked list around a value  |
        //   |   `x`.                                            |
        //   | - Nodes with values less than `x` come before     |
        //   |   nodes with values greater than or equal to `x`. |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two dummy nodes to build two sublists:     |
        //   |   one for < x, one for >= x.                      |
        //   | - Traverses the list, linking nodes to the        |
        //   |   appropriate sublist and updating prev pointers. |
        //   | - Joins the two sublists together.                |
        //   | - Updates the head and resets head.prev to null.  |
        //   +===================================================+

        // If the list is empty, nothing to do
        if (doublyLinkedList.head == null) return;

        // Create two dummy nodes to help build two new lists
        Node dummy1 = new Node(0); // List for nodes < x
        Node dummy2 = new Node(0); // List for nodes >= x

        // Use these pointers to build the two lists
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = doublyLinkedList.head;

        // Traverse the original list
        while (current != null) {
            if (current.value < x) {
                // Attach node to dummy1 list
                prev1.next = current;
                current.prev = prev1;
                prev1 = current;
            } else {
                // Attach node to dummy2 list
                prev2.next = current;
                current.prev = prev2;
                prev2 = current;
            }
            current = current.next;
        }

        // End the second list to avoid any trailing connections
        prev2.next = null;

        // Connect the two lists
        prev1.next = dummy2.next;

        // If dummy2 list has nodes, fix their prev pointer
        if (dummy2.next != null) {
            dummy2.next.prev = prev1;
        }

        // Update head pointer of the main list
        doublyLinkedList.head = dummy1.next;

        // Ensure new head has no previous pointer
        if (doublyLinkedList.head != null) {
            doublyLinkedList.head.prev = null;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(5);
        myDoublyLinkedList.append(6);
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.append(3);
        myDoublyLinkedList.append(10);
        myDoublyLinkedList.append(4);

        System.out.println("Before reversal: ");
        myDoublyLinkedList.printList();

        partitionList(3, myDoublyLinkedList);

        System.out.println("After reversal: ");
        myDoublyLinkedList.printList();
    }
}
