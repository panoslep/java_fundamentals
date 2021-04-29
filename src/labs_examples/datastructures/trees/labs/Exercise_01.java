package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_01

    Please demonstrate how to create a custom Binary Search Tree (BST). Using your custom BST, demonstrate how to:

        1.) Create a new CustomBST
        2.) Insert new elements  -- add()
        3.) Retrieve elements    -- get()
        4.) Update elements      --
        5.) Delete elements
        6.) Print elements (Bonus: try in-order traversal, pre-order traversal, post-order traversal)
        7.) Keep the tree well balanced

 */

import labs_examples.datastructures.trees.examples.CustomBinarySearchTree;

public class Exercise_01 {

    Node root;
    int size;


    public static void main(String[] args) {
        Exercise_01 bst = new Exercise_01(6, 10,9, 15, 3, 5, 2, 1);
        System.out.println(bst.root.leftChild.leftChild);
        System.out.println(bst.get(15));
        System.out.println("-------------------------");
        bst.inOrderTraversal(bst.root);
    }

    Exercise_01(int... data) {

        if (data.length < 1)
            root = null;
        else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }

    public void add(int data) {

        Node newNode = new Node(data);
        Node focusNode = root;

        if (focusNode == null) {
            root = newNode;
            size++;
            return;
        }

        while(true){
            if (focusNode.data > data) {
                if (focusNode.leftChild == null) {
                    focusNode.leftChild = newNode;
                    size++;
                    //balanceTree(blt);
                    return;
                } else {
                    focusNode = focusNode.leftChild;
                }
            } else {
                if (focusNode.rightChild == null) {
                    focusNode.rightChild = newNode;
                    size++;
                    //balanceTree(blt);
                    return;
                } else {
                    focusNode = focusNode.rightChild;
                }
            }
        }
    }

    public Node get(int data) {
        Node newNode = new Node(data);
        Node focusNode = root;

        if (root == null) {
            return null;
        }

        while (true) {
            if (focusNode == null) {
                return null;
            }

            if (focusNode.data == data) {
                return focusNode;
            } else if (focusNode.data > data) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
        }
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.leftChild);
            System.out.println(node);
            inOrderTraversal(node.rightChild);
        }
    }

 

    private void insert(int data) {
        if (root == null) {
            root = new Node(data);
            size++;
        }
        else {
            insert(data, root);
        }
    }

    private Node insert(int data, Node node) {
        if (node == null) {
            node = new Node(data);
            size++;
        }

        if (data < node.data) {
            node.leftChild = insert(data, node.leftChild);
        }
        else if (data > node.data) {
            node.rightChild = insert(data, node.rightChild);
        }
        else {
            return node;
        }
        
        return rebalanceInsert(node, data);
    }

    private Node rebalanceInsert(Node node, int data) {
        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);

        node.height = 1 + Math.max(leftHeight, rightHeight);

        int balanceFactor = leftHeight - rightHeight;

        if (balanceFactor > 1 && data < node.leftChild.data) {
            return rotateRight(node);
        }
        if (balanceFactor < -1 && data > node.rightChild.data) {
            return rotateLeft(node);
        }
        if (balanceFactor > 1 && data > node.leftChild.data) {
            node.leftChild = rotateLeft(node.leftChild);
            return rotateRight(node);
        }
        if (balanceFactor < -1 && data < node.rightChild.data) {
            return rotateLeft(node);
        }
        return node;
    }

    private Node rotateRight(Node node) {
        Node child = node.leftChild;
        Node formerRightChild = child.rightChild;
        child.rightChild = node;
        node.leftChild = formerRightChild;

        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        node.height = 1 + Math.max(leftHeight, rightHeight);

        leftHeight = height(child.leftChild);
        rightHeight = height(child.rightChild);
        child.height = 1 + Math.max(leftHeight, rightHeight);

        node = child;
        return node;
    }

    private Node rotateLeft(Node node) {
        Node child = node.rightChild;
        Node formerLeftChild = child.leftChild;
        child.leftChild = node;
        node.rightChild = formerLeftChild;

        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        node.height = 1 + Math.max(leftHeight, rightHeight);

        leftHeight = height(child.leftChild);
        rightHeight = height(child.rightChild);
        child.height = 1 + Math.max(leftHeight, rightHeight);

        node = child;
        return node;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private class Node {
        Node leftChild;
        Node rightChild;

        // for simplicity, at the moment we're just going to store a simple int in our nodes
        // rather than a more useful key and value pair (implementing that is a lab later :)
        int data;
        int height;


        Node(int data) {
            this.data = data;
            this.height = 1;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}

