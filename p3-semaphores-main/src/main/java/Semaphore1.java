

import java.util.concurrent.Semaphore;

public class Semaphore1 {
    private final Semaphore mySemaphore = new Semaphore(0);

    public void runThreads() {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: Starting task...");
            try {
                Thread.sleep(2000); // Simulates a 2 second task
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 1: Task completed.");
            mySemaphore.release(); // Frees the semaphore for thread 2 to be executed
        });

        Thread thread2 = new Thread(() -> {
            try {
                mySemaphore.acquire(); // Waits for resource access
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 2: Now I can run.");
        });

        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        thread1.start();
    }
}

