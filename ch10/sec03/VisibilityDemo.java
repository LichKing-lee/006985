package ch10.sec03;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class VisibilityDemo {
    private static boolean done = false; // volatile 제어자를 추가하면 문제가 해결된다.
    
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("Hello " + i);
            done = true;
        };
        Runnable goodbye = () -> {
            int i = 1;
            while (!done) i++; 
            System.out.println("Goodbye " + i);
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);        
        executor.execute(goodbye);        
    }
}
