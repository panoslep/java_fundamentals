package labs_examples.multi_threading.labs;


/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */



class Exercise_01 implements Runnable {

    Thread thread;

    //constructor
    public Exercise_01(String name) {
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

class Exercise_01b implements Runnable {

    Thread thread2;

    //constructor
    public Exercise_01b(String name) {
        thread2 = new Thread(this, name);
    }

    // Entry point of thread.
    @Override
    public void run() {
        System.out.println(thread2.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread2.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thread2.getName() + " interrupted.");
        }
        System.out.println(thread2.getName() + " terminating.");
    }
}



class UseThreads {
    public static void main(String args[]) {

        System.out.println("Main thread starting.");

        Exercise_01 thread1 = new Exercise_01("My first Runnable");
        Exercise_01 thread2 = new Exercise_01("My second Runnable");
        Exercise_01 thread3 = new Exercise_01("My third Runnable");

        System.out.println("Main thread ending.");

        //--------------------------------
        // Another way to initiate thread
        //--------------------------------
        System.out.println("2nd test: Main thread starting.");

        Exercise_01b newThread1 = new Exercise_01b("Child #1");
        Exercise_01b newThread2 = new Exercise_01b("Child #2");
        Exercise_01b newThread3 = new Exercise_01b("Child #3");

        newThread1.thread2.start();
        newThread2.thread2.start();
        newThread3.thread2.start();
        System.out.println("2nd test: Main thread terminating.");


    }
}