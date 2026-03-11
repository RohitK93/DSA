package datastructures.doublylinkedlist;

public class DoublyLinkedListIsReverseBetween {

    public static void reverseBetween(int startIndex, int endIndex, DoublyLinkedList doublyLinkedList) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Reverses a portion of a doubly linked list      |
        //   |   between two indices (inclusive range).          |
        //   | - Only nodes between startIndex and endIndex are  |
        //   |   reversed in place.                              |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - A dummy node simplifies handling edge cases.    |
        //   | - `prev` is positioned just before the reversal.  |
        //   | - Nodes are relocated one at a time to reverse    |
        //   |   their order within the specified segment.       |
        //   | - All `next` and `prev` pointers are correctly    |
        //   |   updated to maintain list integrity.             |
        //   | - The head pointer is reset at the end.           |
        //   +===================================================+

        if (doublyLinkedList.head == null || startIndex == endIndex) {
            return;
        }

        // Create a dummy node to simplify edge cases
        Node dummy = new Node(0);
        dummy.next = doublyLinkedList.head;
        doublyLinkedList.head.prev = dummy;

        // Step 1: Move 'prev' to the node before startIndex
        Node prev = dummy;
        for (int i = 0; i < startIndex; i++) {
            prev = prev.next;
        }

        // Step 2: Start reversing from 'current' = prev.next
        Node current = prev.next;

        // Step 3: Reverse by relocating nodes one at a time
        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = current.next;

            // Remove nodeToMove from its place
            current.next = nodeToMove.next;
            if (nodeToMove.next != null) {
                nodeToMove.next.prev = current;
            }

            // Move nodeToMove to the front of the sublist
            nodeToMove.next = prev.next;
            prev.next.prev = nodeToMove;

            prev.next = nodeToMove;
            nodeToMove.prev = prev;
        }

        // Step 4: Update head in case it changed
        doublyLinkedList.head = dummy.next;
        doublyLinkedList.head.prev = null;

    }

    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(0);
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(3);
        myDoublyLinkedList.append(4);
        myDoublyLinkedList.append(5);
        myDoublyLinkedList.append(6);

        System.out.println("Before reversal between: ");
        myDoublyLinkedList.printList();

        reverseBetween(2,4, myDoublyLinkedList);

        System.out.println("After reversal between: ");
        myDoublyLinkedList.printList();
    }
}
