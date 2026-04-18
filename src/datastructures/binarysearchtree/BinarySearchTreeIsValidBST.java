package datastructures.binarysearchtree;

import java.util.ArrayList;

public class BinarySearchTreeIsValidBST {

    public static boolean isValidBST(BinarySearchTree bst) {
        ArrayList<Integer> nodeValues = bst.DFSInOrder1();
        for (int i = 1; i < nodeValues.size(); i++) {
            if (nodeValues.get(i) <= nodeValues.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidBST1(BinarySearchTree bst) {
        return validate(bst.root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(BinarySearchTree.Node node, long min, long max) {
        if (node == null) return true;

        if (node.value <= min || node.value >= max) {
            return false;
        }

        return validate(node.left, min, node.value) &&
                validate(node.right, node.value, max);
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


        System.out.println("Is BST is Valid: "+ isValidBST(bst));
        System.out.println("Is BST is Valid: "+ isValidBST1(bst));
    }
}
