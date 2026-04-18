package datastructures.binarysearchtree;

import java.util.Stack;

public class BinarySearchTreeKthSmallestElement {

    public static Integer kthSmallest(int k, BinarySearchTree bst) {
        Stack<BinarySearchTree.Node> stack = new Stack<>();
        BinarySearchTree.Node node = bst.root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            k -= 1;
            if (k == 0) {
                return node.value;
            }
            node = node.right;
        }
        return null;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println("\nDFS InOrder1:");
        System.out.println( bst.DFSInOrder1() );

        System.out.println("3 Smallest element : "+ kthSmallest(3, bst));
        System.out.println("6 Smallest element : "+ kthSmallest(6, bst));

    }
}
