package datastructures.linkedlist;

public class LinkedListMiddleOfTheNode {

    public static Node findMiddleNode(LinkedList linkedList) {
        Node fast = linkedList.head;
        Node slow = linkedList.head;

        while(fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;

        }

        return slow;
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
        myLinkedList.append(10);
        myLinkedList.append(11);

        System.out.println("LL");
        myLinkedList.printList();

        Node kThElement = findMiddleNode(myLinkedList);
        System.out.println("kThElement is: "+ kThElement.value);
    }
}
