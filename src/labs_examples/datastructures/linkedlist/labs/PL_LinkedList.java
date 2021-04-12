package labs_examples.datastructures.linkedlist.labs;

public class PL_LinkedList<N> {

    private Node2 head;

    public PL_LinkedList(N... data) {

        if (data.length < 1) {
            head = null;
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
            head = new Node2(data);
        } else {
            // if we hit this "else" block, it means the user wants to attach the new node to the end of the list

            // make a new reference to the head node that we can use to traverse the list
            // we do this so we NEVER lose a secure reference to the head node
            Node2 iterator = head;

            // so we need to iterate all the way through list to find last node
            // we'll know we've hit the last node when "iterator.next" is equal to null
            while (iterator.next != null) {
                iterator = iterator.next;
            }

            // once we exit the loop above, "iterator.next" will be referencing the final node in the list
            // at this point we can attach the new Node to the "next" variable of the final node in th list
            iterator.next = new Node2(data);

        }
    }

    public void insertFront(N data) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new Node2(data);
        } else {
            Node2 iterator = head;
            head = new Node2(data);
            head.next = iterator;
        }
    }

    /**
     * Removes the Node of specific value
     */
    public void remove(N value) {

        Node2 previous = null;
        Node2 iterator = head;

        // iterate until index is reached
        while (iterator.next != null) {
            previous = iterator;
            iterator = iterator.next;

            if (iterator.data == value) {
                previous.next = iterator.next;
            }
        }
    }

    /**
     * Returns index of the Node of specific value
     */
    public int indexOf(N value) {

        int count = 0;
        Node2 iterator = head;

        // iterate until index is reached
        while (iterator.next != null) {

            if (iterator.data == value) {
                return count;
            }
            iterator = iterator.next;
            count++;
        }

        System.out.println("The node doesn't exist");
        return 999;


    }

    public int sumOfList() {
        Node2 iterator = head;
        int sum = 0;
        while (iterator != null) {
            sum += (int) iterator.data;
            iterator = iterator.next;
        }
        return sum;
    }

    public void printMyList() {

        Node2 iterator = head;
         do {
            System.out.println(iterator.data);
            iterator = iterator.next;
        } while (iterator != null);
    }

}
