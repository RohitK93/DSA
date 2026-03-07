package datastructures.linkedlist;

public class LinkedListHasLoop {

    public static boolean hasLoop(LinkedList linkedList) {
        Node fast = linkedList.head;
        Node slow = linkedList.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("LL");
        myLinkedList.printList();

        Boolean isHasLoop = hasLoop(myLinkedList);
        System.out.println("isHasLoop : "+ isHasLoop);

        myLinkedList.tail.next = myLinkedList.head;
        isHasLoop = hasLoop(myLinkedList);
        System.out.println("isHasLoop : "+ isHasLoop);
    }
}
