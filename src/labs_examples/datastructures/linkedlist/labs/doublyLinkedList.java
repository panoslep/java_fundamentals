package labs_examples.datastructures.linkedlist.labs;

public class doublyLinkedList<N> {

    private Node3 head;

    public doublyLinkedList(N... data) {

        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++){
                //addEnd(data[i]);
            }
        }
    }
}
