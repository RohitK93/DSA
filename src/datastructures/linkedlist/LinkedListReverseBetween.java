package datastructures.linkedlist;

public class LinkedListReverseBetween {

    public static void reverseBetween(int startIndex, int endIndex, LinkedList linkedList) {
        if(linkedList.head == null) return;

        Node dummyNode = new Node(0);
        dummyNode.next = linkedList.head;
        Node previousNode = dummyNode;

        for(int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node curreNode = previousNode.next;

        for(int i = 0; i < endIndex-startIndex; i++) {
            Node movedNode = curreNode.next;
            curreNode.next = movedNode.next;
            movedNode.next = previousNode.next;
            previousNode.next = movedNode;
        }
        linkedList.head = dummyNode.next;
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

        System.out.println("reverseBetween Before: ");
        myLinkedList.printList();

        reverseBetween(3,6,myLinkedList);

        System.out.println("reverseBetween After: ");
        myLinkedList.printList();
    }

}
