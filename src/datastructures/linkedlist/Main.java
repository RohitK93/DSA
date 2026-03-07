package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        System.out.println("Linked List:");
        myLinkedList.printList();


        myLinkedList.append(10);
        myLinkedList.append(3);
        myLinkedList.append(15);
        myLinkedList.append(99);

        System.out.println("Append Linked List:");
        myLinkedList.printList();

        Node removedNode = myLinkedList.removeLast();

        System.out.println("Removed value: "+ removedNode.value);
        System.out.println("RemoveLast Linked List:");
        myLinkedList.printList();

        myLinkedList.prepend(1000);
        System.out.println("prepend 1000 Linked List:");
        myLinkedList.printList();

        System.out.println("Remove first node: "+myLinkedList.removeFirst().value);


        System.out.println("Linked List before get(): "+ myLinkedList.get(3).value);

        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.set(2, 80);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insert(1, 91);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 90);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(4, 94);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();


        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();
    }
}
