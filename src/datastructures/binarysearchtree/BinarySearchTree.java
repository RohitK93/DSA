package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree {

//    if < left else > right
    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    private void DFSPreOrder(Node currentNode) {
        System.out.print(currentNode.value + " ");
        if (currentNode.left != null) {
            DFSPreOrder(currentNode.left);
        }
        if (currentNode.right != null) {
            DFSPreOrder(currentNode.right);
        }
    }
    public void DFSPreOrder() {
        DFSPreOrder(root);
    }


    public ArrayList<Integer> DFSPreOrder1() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse() {

            }
            Traverse(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
            public void DFSPreOrder(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    DFSPreOrder(currentNode.left);
                }
                if (currentNode.right != null) {
                    DFSPreOrder(currentNode.right);
                }
            }
        }

//        new Traverse(root);
        new Traverse().DFSPreOrder(root);
        return results;
    }

    private void DFSPostOrder(Node currentNode) {
        if (currentNode.left != null) {
            DFSPostOrder(currentNode.left);
        }
        if (currentNode.right != null) {
            DFSPostOrder(currentNode.right);
        }
        System.out.print(currentNode.value + " ");
    }
    public void DFSPostOrder() { DFSPostOrder(root); }


    public ArrayList<Integer> DFSPostOrder1() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }

        new Traverse(root);
        return results;
    }

    private void DFSInOrder(Node currentNode) {
        if (currentNode.left != null) {
            DFSInOrder(currentNode.left);
        }
        System.out.print(currentNode.value + " ");
        if (currentNode.right != null) {
            DFSInOrder(currentNode.right);
        }
    }
    public void DFSInOrder() { DFSInOrder(root); }


    public ArrayList<Integer> DFSInOrder1() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(root);
        return results;
    }



    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }
    public boolean rContains(int value) { return rContains(root, value); }



    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }
    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }


    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }


    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;

        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public Node deleteNode(int value) {
        return deleteNode(root, value);
    }
}
















