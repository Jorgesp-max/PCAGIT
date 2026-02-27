

import java.util.concurrent.Semaphore;

public class Semaphore2 {
    private final Semaphore mySemaphore = new Semaphore(1);

    public void runThreads() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Trying to enter the critical section...");

            try {
                mySemaphore.acquire(); //  Blocks the access (mutex)
                System.out.println(threadName + " has entered the critical section.");
                Thread.sleep(2000); // Simulates task
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                System.out.println(threadName + " has exited the critical section.");
                mySemaphore.release(); //  Frees the semaphore
            }
        };


        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        //FILL IN MISSING CODE
        //run threads

    }
}

