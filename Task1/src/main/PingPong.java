package main;

public class PingPong {

    public synchronized void printPing() throws InterruptedException {
        while (true){
            System.out.println("Ping");
            notify();
            wait();
        }
    }

    public synchronized void printPong() throws InterruptedException {
        while (true){
            System.out.println("Pong");
            notify();
            wait();
        }
    }
}
