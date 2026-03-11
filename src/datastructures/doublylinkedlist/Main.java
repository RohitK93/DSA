package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(3);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List length:");
        myDLL.printList();

        myDLL.append(19);
        myDLL.getLength();
        System.out.println("\nDoubly Linked List After append :");
        myDLL.printList();

        System.out.println("removed Last node is: "+myDLL.removeLast().value);
        System.out.println("\nDoubly Linked List After removeLast node :");

        myDLL.prepend(6);
        System.out.println("\n\nAfter prepend():");
        myDLL.printList();

        // (2) Items - Returns 2 Node
        System.out.println("Remove first: "+myDLL.removeFirst().value);

        myDLL.append(19);
        myDLL.append(20);

        System.out.println("DLL before get():");
        myDLL.printList();
        System.out.println("Get 3 index: "+myDLL.get(1).value);

        System.out.println("DLL before set():");
        myDLL.printList();

        myDLL.set(2, 99);

        System.out.println("\nDLL after set():");
        myDLL.printList();

        System.out.println("DLL before insert():");
        myDLL.printList();

        myDLL.insert(1, 22);

        System.out.println("\nDLL after insert(2) in middle:");
        myDLL.printList();

        System.out.println("DLL before remove():");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL.printList();
    }
}
