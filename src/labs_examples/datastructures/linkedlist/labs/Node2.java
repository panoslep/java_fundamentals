package labs_examples.datastructures.linkedlist.labs;

public class Node2<N> {

    // a numeric variable to hold the data we to want to store in the list
    N data;
    // a "link" to the "next" Node in the LinkedList
    Node2 next;

    // a simple constructor that takes in data
    public Node2(N data) {
        this.data = data;
        this.next = null;
    }

    // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public Node2(N data, Node2 node) {
        this.data = data;
        this.next = node;
    }
}

