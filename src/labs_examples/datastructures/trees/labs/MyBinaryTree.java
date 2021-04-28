package labs_examples.datastructures.trees.labs;

public class MyBinaryTree {

    Node root;

    public static void main(String[] args) {

        MyBinaryTree mbt = new MyBinaryTree();

        mbt.addNode(50, "boss");
        mbt.addNode(25, "vice pres");
        mbt.addNode(15, "office manager");
        mbt.addNode(30, "secretary");
        mbt.addNode(75, "sales manager");
        mbt.addNode(85, "salesman 1");

        mbt.postOrderTraverseTree(mbt.root);
        System.out.println("search for 30");
        System.out.println(mbt.findNode(30));

    }

    public void addNode(int key, String name) {

        //create new node using key and name
        Node newNode = new Node(key, name);

        // check if this is the root element of the tree
        if (root == null) {
            root = newNode;
        }
        else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    //change the focus to left child
                    focusNode = focusNode.leftChild;

                    //if the left child has no children we want to place the new node to its left.
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        //exit loop
                        return;
                    }
                } else {
                        //if we get here the node needs to go to the right
                        focusNode = focusNode.rightChild;
                        if (focusNode == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                }

            }

        }


    }

    //traverse the tree
    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }



    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    //search for a node with its key
    public Node findNode(int key) {
        Node focusNode = root;
        //search until the focus node key matches the search key
        while (focusNode.key != key) {
            //should we check down the left children?
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                //look right
                focusNode = focusNode.rightChild;
            }

            // if we get here the key doesn't exist
            if (focusNode == null)
                return null;
        }
        return focusNode;
    }

}

class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", name='" + name + '\'' +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
