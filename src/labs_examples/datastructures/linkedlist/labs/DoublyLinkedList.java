package labs_examples.datastructures.linkedlist.labs;

public class DoublyLinkedList<N> {

    private Node3 head;
    private Node3 tail;

    public DoublyLinkedList(N... data) {

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
            while (iterator.next != null) {
                iterator = iterator.next;
            }

            // once we exit the loop above, "iterator.next" will be referencing the final node in the list
            // at this point we can attach the new Node to the "next" variable of the final node in th list
            iterator.next = new Node3(data, iterator);

        }
    }



    /**
     * Inserts a new node with the given data at the end of the list
     */
    public void insertFront(N data) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new Node3(data);
        } else {
            Node3 temp = head;
            head = new Node3(data);
            head.next = temp;
            temp.previous = head;
        }
    }

    public void remove(N data) {
        if (head.data == data) {
            head = head.next;
            head.previous = null;
        }
        else {
            Node3 iterator = head;
            while(iterator.next != null && iterator.data != data) {
                iterator = iterator.next;
            }
            if (iterator.data == data) {
                if (iterator.next == null) {
                    Node3 previous = iterator.previous;
                    previous.next = null;
                } else {
                    Node3 previous = iterator.previous;
                    previous.next = iterator.next;
                    iterator.previous = previous;
                }
            }
        }
    }

    public void print() {
        Node3 iterator = head;
        do {
            System.out.println(iterator.data);
            iterator = iterator.next;
        } while (iterator != null);
    }
}
