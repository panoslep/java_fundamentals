package labs_examples.datastructures.hashmap.labs;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap<P, R> {

        // create the underlying Entry array with the initial size of 10
        private Data<P, R>[] map = new Data[10];

        // track the current number of elements in the hashmap
        private int numRecords = 0;


        /**
         * Hashes the given key and returns a table index
         *
         * @param pointer to be hashed
         * @return a map index
         */
        private int marking(P pointer) {
            // get the hashCode for the key and mod that hashCode by the length of the array
            int mark = Math.abs(pointer.hashCode() % map.length);
            // the result will be the index where we can find and/or place entries
            return mark;
        }

        /**
         * Adds the key-value pair to the hashmap
         *
         * @param pointer   a key Object
         * @param record a value Object
         */
        public void add(P pointer, R record) {
            // call the marking() method to get the index to place the element
            int mark = marking(pointer);

            // create the Entry object containing the key and value that we will store in the underlying array
            Data<P, R> data = new Data(pointer, record);
            // no element at the given index, means no collision
            // go ahead and simply add the value to the array
            if (map[mark] == null) {
                map[mark] = data;
                numRecords++;
            }
            // otherwise, there was a collision
            // we need iterate through the linked list at that index
            else {
                // get the first Entry (in the linked list) at the given index
                Data<P, R> h = map[mark];

                // traverse the linked list
                while (h.next != null) {
                    if (h.getPointer() == pointer) {
                        h.setRecord(record);
                        return;
                    }
                    h = h.next;
                }

                // after we exit the while loop above, we'll be at the end of the linked list
                // this is where we can add the new Entry
                Data temp = map[mark];
                data.next = temp;
                map[mark] = data;

                numRecords++;
            }

            // check for resize
            if (numRecords > map.length * .5) {
                // the resize method will create a bigger underlying array and
                // add all values in the existing array to the new, larger array
                increase();
            }
        }

        /**
         * Resizes the underlying array to double its previous size and copies the old values into it
         */
        private void increase() {
            // make a copy of the existing table and call it "old"
            Data<P, R>[] previous = map;
            // create a new Entry[] that is twice the size of the old one
            map = new Data[previous.length * 3];

            // iterate over the length of the old array
            for (int j = 0; j < previous.length; j++) {
                try {
                    // get the Entry at the index of "i" from the "old" table
                    Data data = previous[j];
                    // call the put() method passing the key and value to add this element to the new table
                    add((P) data.getPointer(), (R) data.getRecord());

                    // check to see if this entry is actually the start of a linked list
                    while (data.next != null) {
                        // if it is, traverse to the next node
                        data = data.next;
                        // and call the put() method to add this element
                        add((P) data.getPointer(), (R) data.getRecord());
                        // loop
                    }
                } catch (Exception e) {
                    // do nothing - this is just to handle empty indexes
                }
            }
        }

        /**
         * Removes the pair at the given key from the hashmap
         *
         * @param pointer of the pair to be removed
         */
        public void delete(P pointer) {

            // ensure key exists by calling the get() method
            if (receive(pointer) == null) {
                // if the get() method returns null, there's nothing to delete
                System.out.println("There's nothing to delete");
                return;
            }

            // otherwise, get the index for the key by calling the hash() method
            int mark = marking(pointer);

            // get the Entry at the index
            Data<P, R> data = map[mark];

            // if this entry has the matching key, remove the element at this index
            if (data.getPointer().equals(pointer)){
                map[mark] = null;
                numRecords--;
                return;
            }

            // otherwise, if the next element in the linked list is not null
            while (data.next != null ) {
                // if the key of the next element in the linked list is not the key we're looking for
                if (data.next.getPointer() != pointer) {
                    // traverse the linked list to the next node
                    data = data.next;
                }
            }

            // when we exit the loop above, entry.next will contain the key we're looking for
            // if we're deleting from the middle of a linked list we need to link
            // entry.next to entry.next.next - this is basically like turning this list:
            // a -> b -> c
            // into this list:
            // a -> c
            if(data.next.next != null){
                data.next = data.next.next;
                numRecords--;
                return;
            }
            // otherwise, entry.next is the end of the list so we can just chop it off
            else {
                data.next = null;
                numRecords--;
                return;
            }
        }

        /**
         * Finds the value of a key
         *
         * @param pointer to search for
         * @return value of the given key
         */
        public R receive(P pointer) {
            // call the hash() method to get the index for the key
            int mark = marking(pointer);

            // nothing at key - return null
            if (map[mark] == null) {
                System.out.println("The entry does not exist");
                return null;
            }

            // otherwise, get the Entry at the index
            Data<P, R> data = map[mark];

            // if the key of the current entry is not the key we're looking for
            // that means we're looking at a linked list and we need to traverse it
            // if the key does match right from the start, this loop will be skipped
            while (data.getPointer() != pointer) {

                // if we reach the end of the list and haven't found it return null
                if (data.next == null) {
                    System.out.println("The entry does not exist");
                    return null;
                }

                // otherwise, keep traversing the linked list
                data = data.next;
            }

            // if we get here, that means the key has been found, return the value
            return data.getRecord();
        }

        /**
         * For Testing: gets the size of the underlying array
         *
         * @return int storage size
         */
        public int getStorageSize() {
            return map.length;
        }

        // Return number of records
        public int hashSize() {return numRecords;}

        // update the record if the pointer exists
        // returns true if the value was replaced
        public boolean update(P pointer, R old_record, R new_record) {
            // check if the old record exists
            if (receive(pointer) == old_record) {
                delete(pointer);
                add(pointer, new_record);
                return true;
            }
            // if we reach this the old record does not match and it wasn't updated
            return false;
        }

        // adds a record if it doesn't already exists
        // returns true if the value was added
        public boolean addIfAbsent(P pointer, R record) {
            // check if the records exists
            if (receive(pointer) == record) { return false;}
            add(pointer, record);
            return true;
        }

        public boolean isEmpty() {
            if (numRecords == 0)
                return true;
            else
                return false;
        }
}

    /**
     * A Pointer-Record Pair
     */
    class Data<P, R> {
        private P pointer;
        private R record;
        // it means this is a LinkedList
        Data next = null;

        Data(P pointer, R record) {
            this.pointer = pointer;
            this.record = record;
        }

        public P getPointer() {
            return pointer;
        }

        public R getRecord() {
            return record;
        }

        public void setRecord(R record) {
            this.record = record;
        }
    }


