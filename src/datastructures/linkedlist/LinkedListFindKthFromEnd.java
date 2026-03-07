package datastructures.linkedlist;

public class LinkedListFindKthFromEnd {

    public static Node findKthFromEnd(int k, LinkedList linkedList) {
        //   +===================================================+
        //   | Description:                                      |
        //   | - Finds the k-th node from the end of a singly    |
        //   |   linked list.                                    |
        //   | - Returns the node at that position or null if    |
        //   |   `k` is invalid or exceeds the list length.      |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two pointers, `fast` and `slow`, starting  |
        //   |   at the head of the list.                        |
        //   | - Moves `fast` forward `k` nodes ahead of `slow`. |
        //   | - Then moves both pointers together until `fast`  |
        //   |   reaches the end.                                |
        //   | - At that point, `slow` points to the k-th node   |
        //   |   from the end and is returned.                   |
        //   +===================================================+


        if (k <= 0) return null;

        Node slow = linkedList.head;
        Node fast = linkedList.head;

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public int binaryToDecimal(LinkedList myLinkedList) {
        int num = 0;
        Node current =  myLinkedList.head;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
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

        Node kThElement = findKthFromEnd(1, myLinkedList);
        System.out.println("kThElement is: "+ kThElement.value);

    }
}
