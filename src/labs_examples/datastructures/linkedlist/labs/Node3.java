package labs_examples.datastructures.linkedlist.labs;

public class Node3<N> {

    // a numeric variable to hold the data we to want to store in the list
    N data;
    // a "link" to the "next" Node in the LinkedList
    Node3 next;
    Node3 previous;

    // a simple constructor that takes in data
    public Node3(N data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }



    // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public Node3(N data, Node3 previous) {
        this.data = data;
        this.previous = previous;
    }
}