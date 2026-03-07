package datastructures.linkedlist;

public class LinkedListRemoveDuplicate {

    public static void removeDuplicates(LinkedList linkedList) {
        Node current = linkedList.head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    linkedList.length -= 1;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(5);


        System.out.println("Before");
        myLinkedList.printList();

        removeDuplicates(myLinkedList);
        System.out.println("After");
        myLinkedList.printList();
    }
}
