package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 extends Thread {

    public Exercise_02(String name) {
        super(name);
        start();
    }

    // Entry point of thread.
    // Begin execution of new thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
    }
}

class UseThreads2 {
    public static void main(String args[]) {

        System.out.println("Main thread starting.");

        Exercise_01 thread1 = new Exercise_01("My first Runnable");
        Exercise_01 thread2 = new Exercise_01("My second Runnable");
        Exercise_01 thread3 = new Exercise_01("My third Runnable");

        System.out.println("Main thread ending.");


    }
}
