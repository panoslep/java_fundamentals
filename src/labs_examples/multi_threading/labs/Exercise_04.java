package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */



class Exercise_04 implements Runnable {

    Thread thread;

    //constructor
    public Exercise_04(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    // Entry point of thread.
    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}


class SyncDemo {
    public static void main(String args[])  {
        //Sender snd = new Sender();
        Exercise_04 s1 = new Exercise_04( " Hi "  );
        Exercise_04 s2 = new Exercise_04( " Bye "  );
        // Start two threads of ThreadedSend type
        s1.thread.start();
        s2.thread.start();


        // wait for threads to end
        try {
            s1.thread.join();
            s2.thread.join();
        } catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}