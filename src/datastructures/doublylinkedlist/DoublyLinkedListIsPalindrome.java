package datastructures.doublylinkedlist;

public class DoublyLinkedListIsPalindrome {

    public static boolean isPalindrome(DoublyLinkedList doublyLinkedList) {
        if (doublyLinkedList.length <= 1) return true;

        Node forwardNode = doublyLinkedList.head;
        Node backwardNode = doublyLinkedList.tail;
        for (int i = 0; i < doublyLinkedList.length / 2; i++) {
            if (forwardNode.value != backwardNode.value) return false;
            forwardNode = forwardNode.next;
            backwardNode = backwardNode.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(0);
        myDoublyLinkedList.append(0);
        myDoublyLinkedList.append(1);



        boolean isPalindrome = isPalindrome(myDoublyLinkedList);
        System.out.println("isPalindrome: "+isPalindrome);

        myDoublyLinkedList.append(1);

        isPalindrome = isPalindrome(myDoublyLinkedList);
        System.out.println("isPalindrome: "+isPalindrome);
    }
}
