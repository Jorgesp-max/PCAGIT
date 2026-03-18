import practica_p5p6.*;

import java.util.ArrayList;
import java.util.Collections;

public class MainENG {
    public static void main(String[] args) {
        int elem = 60;
        MonitorENG monitor = new MonitorENG(); //This is for P5
        //MonitorP6 monitor = new MonitorP6(); //This is for future P6

        Thread threadproducer1 = new Thread(() -> {
            for (int a = 1; a <= elem/2; a++) {
                monitor.addInt(a);
            }
        });
        Thread threadproducer2 = new Thread(() -> {
            for (int a = elem; a > elem/2; a--) {
                monitor.addInt(a);
            }
        });

        Thread threadconsumerEven = new Thread(()->{
            int elem_gathered = 0;
            int aux;
            ArrayList<Integer> listEven = new ArrayList<>();

            while(elem_gathered<(elem/2)){
                try {
                    aux = monitor.getEven();
                    if(aux > 0) {
                        listEven.add(aux);
                        elem_gathered++;
                    }
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Collections.sort(listEven);
            System.out.println("Even numbers sorted: "+ listEven.toString());
        });

        Thread threadconsumerOdd = new Thread(()->{
            int elem_gathered = 0;
            int aux;
            ArrayList<Integer> listOdd = new ArrayList<>();

            while(elem_gathered<(elem/2)){
                try {
                    aux = monitor.getOdd();
                    if(aux > 0){
                        listOdd.add(aux);
                        elem_gathered++;
                    }
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Collections.sort(listOdd);
            System.out.println("Odd numbers sorted: "+ listOdd.toString());
        });
        threadproducer1.start();
        threadproducer2.start();
        threadconsumerEven.start();
        threadconsumerOdd.start();

        try{
            threadproducer1.join();
            threadproducer2.join();
            threadconsumerEven.join();
            threadconsumerOdd.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        monitor.printList();
        System.out.println("The main programm exited");
    }
}