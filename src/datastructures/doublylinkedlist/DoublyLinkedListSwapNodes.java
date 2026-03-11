package datastructures.doublylinkedlist;

public class DoublyLinkedListSwapNodes {


    public static void swapPairs(DoublyLinkedList doublyLinkedList) {
        Node dummyNode = new Node(0);
        dummyNode.next = doublyLinkedList.head;
        Node previousNode = dummyNode;

        while (doublyLinkedList.head != null && doublyLinkedList.head.next != null) {
            Node firstNode = doublyLinkedList.head;
            Node secondNode = doublyLinkedList.head.next;

            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = previousNode;
            firstNode.prev = secondNode;

            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            doublyLinkedList.head = firstNode.next;
            previousNode = firstNode;
        }

        doublyLinkedList.head = dummyNode.next;
        if (doublyLinkedList.head != null) doublyLinkedList.head.prev = null;
    }

    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(0);
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(3);

        System.out.println("Before swapPairs: ");
        myDoublyLinkedList.printList();

        swapPairs(myDoublyLinkedList);

        System.out.println("After swapPairs: ");
        myDoublyLinkedList.printList();
    }
}
