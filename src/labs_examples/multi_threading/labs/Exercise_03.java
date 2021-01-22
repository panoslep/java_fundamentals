package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

class Exercise_03 implements Runnable {

    Thread thread;

    //constructor
    public Exercise_03(String name) {
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

class demoPriority {
    public static void main(String args[]) {

        System.out.println("Main thread starting.");

        Exercise_03 thread1 = new Exercise_03("1st min priority");
        Exercise_03 thread2 = new Exercise_03("2nd norm priority");
        Exercise_03 thread3 = new Exercise_03("3dr max priority");

        thread1.thread.setPriority(Thread.MIN_PRIORITY);
        thread3.thread.setPriority(Thread.MAX_PRIORITY);
        thread2.thread.setPriority(Thread.NORM_PRIORITY);

        System.out.println("Main thread ending.");

    }
}