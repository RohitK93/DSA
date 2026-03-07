package datastructures.linkedlist;

public class LinkedListPartition {

    public static void partitionList(int x, LinkedList linkedList) {
        if (linkedList.head == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = linkedList.head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;

        linkedList.head = dummy1.next;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(6);
        myLinkedList.append(3);
        myLinkedList.append(10);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(6);

        System.out.println("partitionList Before: ");
        myLinkedList.printList();

        partitionList(4,myLinkedList);

        System.out.println("partitionList After: ");
        myLinkedList.printList();
    }
}
