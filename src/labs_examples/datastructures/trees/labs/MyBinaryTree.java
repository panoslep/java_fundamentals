package labs_examples.datastructures.trees.labs;

public class MyBinaryTree {

    Node root;

    public static void main(String[] args) {

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
                if (key < focusNode.key){
                    //change the focus to left child
                    focusNode = focusNode.leftChild;

                    //if the left child has no children we want to place the new node to its left.
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        //exit loop
                        return;
                    }
                    else {
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


    }

    //traverse the tree
    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
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
