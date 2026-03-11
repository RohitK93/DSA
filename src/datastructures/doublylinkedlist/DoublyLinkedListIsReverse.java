package datastructures.doublylinkedlist;

public class DoublyLinkedListIsReverse {

    public static void reverse(DoublyLinkedList doublyLinkedList) {
        Node current = doublyLinkedList.head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        temp = doublyLinkedList.head;
        doublyLinkedList.head = doublyLinkedList.tail;
        doublyLinkedList.tail = temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(0);
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(3);

        System.out.println("Before reversal: ");
        myDoublyLinkedList.printList();

        reverse(myDoublyLinkedList);

        System.out.println("After reversal: ");
        myDoublyLinkedList.printList();
    }
}
