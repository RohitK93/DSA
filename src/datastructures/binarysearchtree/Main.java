package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */



        // ROOT MUST BE PUBLIC FOR THESE LINES TO WORK
        System.out.println("Root: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */

        System.out.println("is 17 contains: "+myBST.contains(17));

        System.out.println("is 1 contains: "+myBST.contains(1));

        myBST.insert(5);
        myBST.insert(6);
        myBST.insert(7);

        System.out.println("delete 3: "+myBST.deleteNode(3).value);


        BinarySearchTree bFS = new BinarySearchTree();
        bFS.insert(47);
        bFS.insert(21);
        bFS.insert(76);
        bFS.insert(18);
        bFS.insert(27);
        bFS.insert(52);
        bFS.insert(82);

//                      47
//                    /    \
//                   21     76
//                  /  \   /  \
//                 18  27  52  82

        System.out.println("\nBreadth First Search:");
        System.out.println( bFS.BFS() );

        /*
            EXPECTED OUTPUT:
            ----------------
            Breadth First Search:
            [47, 21, 76, 18, 27, 52, 82]

        */


        BinarySearchTree dFSPreOrder = new BinarySearchTree();

        dFSPreOrder.insert(47);
        dFSPreOrder.insert(21);
        dFSPreOrder.insert(76);
        dFSPreOrder.insert(18);
        dFSPreOrder.insert(27);
        dFSPreOrder.insert(52);
        dFSPreOrder.insert(82);

//                      47
//                    /    \
//                   21     76
//                  /  \   /  \
//                 18  27  52  82


        System.out.println("\nDFS PreOrder:");
        dFSPreOrder.DFSPreOrder();

        System.out.println("\nDFS PreOrder1:");
        System.out.println( dFSPreOrder.DFSPreOrder1() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS PreOrder:
            [47, 21, 18, 27, 76, 52, 82]

        */

        BinarySearchTree dFSPostOrder = new BinarySearchTree();

        dFSPostOrder.insert(47);
        dFSPostOrder.insert(21);
        dFSPostOrder.insert(76);
        dFSPostOrder.insert(18);
        dFSPostOrder.insert(27);
        dFSPostOrder.insert(52);
        dFSPostOrder.insert(82);

//                      47
//                    /    \
//                   21     76
//                  /  \   /  \
//                 18  27  52  82

        System.out.println("\nDFS PostOrder:");
        dFSPostOrder.DFSPostOrder();

        System.out.println("\nDFS PostOrder1:");
        System.out.println( dFSPostOrder.DFSPostOrder1() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS PostOrder:
            [18, 27, 21, 52, 82, 76, 47]

        */

        BinarySearchTree dFSInOrder = new BinarySearchTree();

        dFSInOrder.insert(47);
        dFSInOrder.insert(21);
        dFSInOrder.insert(76);
        dFSInOrder.insert(18);
        dFSInOrder.insert(27);
        dFSInOrder.insert(52);
        dFSInOrder.insert(82);

//                      47
//                    /    \
//                   21     76
//                  /  \   /  \
//                 18  27  52  82

        System.out.println("\nDFS InOrder:");
        dFSInOrder.DFSInOrder();

        System.out.println("\nDFS InOrder1:");
        System.out.println( dFSInOrder.DFSInOrder1() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS InOrder:
            [18, 21, 27, 47, 52, 76, 82]

        */
    }
}
