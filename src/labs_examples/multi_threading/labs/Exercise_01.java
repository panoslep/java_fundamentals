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

    Thread thread;

    //constructor
    public Exercise_01b(String name) {
        thread = new Thread(this, name);
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

        newThread1.run();
        newThread2.run();
        newThread3.run();
        System.out.println("2nd test: Main thread terminating.");


    }
}


//    // First, construct a MyThread object.
//    labs_examples.multi_threading.labs.Exercise_01 mt;
//        mt = new labs_examples.multi_threading.labs.Exercise_01("Child #1");
//
//                // Next, construct a thread from that object.
//                Thread newThrd = new Thread(mt);
//
//                // Finally, start execution of the thread.
//                newThrd.start();
//
//                for(int i=0; i<50; i++) {
//        System.out.print(".");
//        try {
//        Thread.sleep(100);
//        }
//        catch(InterruptedException exc) {
//        System.out.println("Main thread interrupted.");
//        }
//        }
