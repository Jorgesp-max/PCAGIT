
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProductorConsumidor {
    private static final int TAM_BUFFER = 5; // Tamaño del buffer
    private static final Queue<Integer> buffer = new LinkedList<>();
    
    // Semáforos para gestionar el acceso al buffer
    private static final Semaphore espacioDisponible = new Semaphore(TAM_BUFFER); // Controla espacio disponible
    private static final Semaphore elementosDisponibles = new Semaphore(0); // Controla elementos disponibles
    private static final Semaphore mutex = new Semaphore(1); // Exclusión mutua para el acceso al buffer

    public void ejecutarHilos() {
        // Crear y ejecutar productores y consumidores
        Thread productor1 = new Thread(new Productor(), "Productor 1");
        Thread productor2 = new Thread(new Productor(), "Productor 2");
        //COMPLETAR EL CÓDIGO
        // Crear y ejecutar "Consumidor1" y "Consumidor2"

        productor1.start();
        productor2.start();
        //COMPLETAR EL CÓDIGO
        //Arrancar los consumidores
    }

    // Clase Productor
    static class Productor implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    int item = (int) (Math.random() * 100); // Producir un elemento
                    espacioDisponible.acquire(); // Esperar espacio disponible
                    mutex.acquire(); // Exclusión mutua
                    buffer.add(item); // Añadir el elemento al buffer
                    System.out.println(Thread.currentThread().getName() + " produjo: " + item);
                    mutex.release(); // Liberar exclusión mutua
                    elementosDisponibles.release(); // Señalar que hay un nuevo elemento
                    Thread.sleep(1000); // Simular tiempo de producción
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /// COMPLETAR CÖDIGO
    // Implementar la Clase Consumidor, de modo que imprima el valor consumido
}

