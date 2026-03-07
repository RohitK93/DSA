package datastructures.linkedlist;

public class LinkedListBinaryToDecimal {

    //   +===================================================+
    //   |               WRITE YOUR CODE HERE                |
    //   | Description:                                      |
    //   | - This method converts a binary number,           |
    //   |   represented as a linked list, to a decimal int. |
    //   |                                                   |
    //   | Return type: int                                  |
    //   | - Returns the decimal equivalent of the binary    |
    //   |   number.                                         |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - We use a while loop to traverse the linked list.|
    //   | - Multiply the current sum by 2 and add the value |
    //   |   at each node to get the decimal number.         |
    //   +===================================================+

    public static int binaryToDecimal(LinkedList linkedList) {
        int num = 0;
        Node current = linkedList.head;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(0);
        myLinkedList.append(1);
        myLinkedList.append(1);



        int decimalValue = binaryToDecimal(myLinkedList);
        System.out.println("decimalValue: "+decimalValue);
    }
}
