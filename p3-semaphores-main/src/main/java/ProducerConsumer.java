
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerConsumer {
    private static final int BUFFER_SIZE = 5;
    private static final Queue<Integer> buffer = new LinkedList<>();
    
    // Semaphores to manage buffer access
    private static final Semaphore availableSpace = new Semaphore(BUFFER_SIZE);
    private static final Semaphore availableElements = new Semaphore(0);
    private static final Semaphore mutex = new Semaphore(1);

    public void runThreads() {
        // Create and run producers and consumers
        Thread producer1 = new Thread(new Producer(), "Producer 1");
        Thread producer2 = new Thread(new Producer(), "Producer 2");
        //FIlL IN MISSING CODE
        //Create and run "consumer1" and "consumer2"


        producer1.start();
        producer2.start();
        //FIlL IN MISSING CODE
        //Start consumers

    }
    // Class Producer
    static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    int item = (int) (Math.random() * 100); // Produce one element
                    availableSpace.acquire(); // Wait for available space
                    mutex.acquire(); // Exclusive access
                    buffer.add(item); // Add the element to the buffer
                    System.out.println(Thread.currentThread().getName() + " produced: " + item);
                    mutex.release(); // Free access
                    availableElements.release(); // Notify available elements
                    Thread.sleep(1000); // Simulate production time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // FILL IN MISSING CODE
    // Implement the Consumer class, so that it prints the consumed value
    
}

