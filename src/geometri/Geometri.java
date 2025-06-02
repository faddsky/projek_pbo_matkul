package geometri;

import geometri.bangun2d.*;
import geometri.bangun3d.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Geometri {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(10);

        
        Runnable lingkaran = new Lingkaran(7);
        Runnable persegi = new Persegi(5);
        
       
        Runnable bola = new Bola(3);
        Runnable tabung = new Tabung(3, 10);
        Runnable kerucut = new Kerucut(4, 7);

        
        executor.submit(lingkaran);
        executor.submit(persegi);
        executor.submit(bola);
        executor.submit(tabung);
        executor.submit(kerucut);

        
        executor.shutdown();
    }
}
