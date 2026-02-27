

import java.util.concurrent.Semaphore;

public class Semaphore3 {
    //FILL IN MISSING CODE
    //CONFIGURE SEMAPHORES
    //private final Semaphore semaphore1 = new Semaphore(XX); // Blocks thread 1
    //private final Semaphore semaphore2 = new Semaphore(XX); // Blocks thread 2
    //private final Semaphore semaphore3 = new Semaphore(XX); // Blocks thread 3

    private final Runnable task = () -> {
        String threadName = Thread.currentThread().getName();

        try {
            if (threadName.equals("Thread 1")) {
                //FILL IN MISSING CODE
                //check for locking
            } else if (threadName.equals("Thread 2")) {
                //FILL IN MISSING CODE
                //check for locking
            } else if (threadName.equals("Thread 3")) {
                //FILL IN MISSING CODE
                //check for locking
            }

            System.out.println(threadName + " is starting...");
            Thread.sleep(1000); // Simulates task
            System.out.println(threadName + " ended.");

            if (threadName.equals("Thread 1")) {
                //FILL IN MISSING CODE
                //unlock
            } else if (threadName.equals("Thread 2")) {
                //FILL IN MISSING CODE
                //unlock
            } else if (threadName.equals("Thread 3")) {
                //FILL IN MISSING CODE
                //unlock
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    };

    public void runThreads() {
        for (int i = 0; i < 10; i++){
            Thread thread1 = new Thread(task, "Thread 1");
            Thread thread2 = new Thread(task, "Thread 2");
            Thread thread3 = new Thread(task, "Thread 3");
    
            thread1.start();
            thread2.start();
            thread3.start();
        }

    }
}


