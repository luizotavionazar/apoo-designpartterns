package src.service;

import java.util.concurrent.TimeUnit;

public class Timer {
    
    public void esperar() {
        try {
            TimeUnit.SECONDS.sleep(1); 
        } catch (InterruptedException e) {
            System.out.println("");
            Thread.currentThread().interrupt();
        }
    }
}
