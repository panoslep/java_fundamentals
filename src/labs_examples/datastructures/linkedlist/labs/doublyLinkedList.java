package labs_examples.datastructures.linkedlist.labs;

public class doublyLinkedList<N> {

    private Node3 head;
    private Node3 tail;

    public doublyLinkedList(N... data) {

        if (data.length < 1) {
            head = null;
            tail = null;
        } else {
            for (int i = 0; i < data.length; i++){
                addEnd(data[i]);
            }
        }
    }

    public void addEnd(N data) {
        insertEnd(data);
    }

    public void addFront(N data) {
        insertFront(data);
    }


    /**
     * Inserts a new node with the given data at the end of the list
     */
    public void insertEnd(N data) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new Node3(data);
        } else {
            // if we hit this "else" block, it means the user wants to attach the new node to the end of the list

            // make a new reference to the head node that we can use to traverse the list
            // we do this so we NEVER lose a secure reference to the head node
            Node3 iterator = head;

            // so we need to iterate all the way through list to find last node
            // we'll know we've hit the last node when "iterator.next" is equal to null
            while (iterator.next3 != null) {
                iterator = iterator.next3;
            }

            // once we exit the loop above, "iterator.next" will be referencing the final node in the list
            // at this point we can attach the new Node to the "next" variable of the final node in th list
            iterator.next3 = new Node3(data);

        }
    }



    /**
     * Inserts a new node with the given data at the end of the list
     */
    public void insertFront(N data) {
        // if "head" is null, create new root node
        if (tail == null) {
            tail = new Node3(data);
        } else {
            // if we hit this "else" block, it means the user wants to attach the new node to the front of the list

            // make a new reference to the tail node that we can use to traverse the list
            // we do this so we NEVER lose a secure reference to the tail node
            Node3 iterator = tail;

            // so we need to iterate all the way through list to find last node
            // we'll know we've hit the last node when "iterator.next" is equal to null
            while (iterator.previous3 != null) {
                iterator = iterator.previous3;
            }

            // once we exit the loop above, "iterator.previous3" will be referencing the final node in the list
            // at this point we can attach the new Node to the "previous" variable of the final node in th list
            iterator.previous3 = new Node3(data);
        }
    }

    public void printMyList() {

        Node3 iterator = head;
        do {
            System.out.println(iterator.data3);
            iterator = iterator.next3;
        } while (iterator != null);
    }
}
