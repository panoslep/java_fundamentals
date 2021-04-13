package labs_examples.datastructures.linkedlist.labs;

public class Node3<N> {

    // a numeric variable to hold the data we to want to store in the list
    N data3;
    // a "link" to the "next" Node in the LinkedList
    Node3 next3;
    Node3 previous3;

    // a simple constructor that takes in data
    public Node3(N data3) {
        this.data3 = data3;
        this.next3 = null;
        this.previous3 = null;
    }

    // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public Node3(N data3, Node3 node3) {
        this.data3 = data3;
        this.next3 = node3;
        this.previous3 = node3;
    }
}