package main;

public class Main {
//    private static final Object object = new Object();
//    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            synchronized (object) {
//                while (true) {
//                    try {
//                        System.out.println("ping");
//                        object.notify();
//                        object.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            synchronized (object) {
//                while (true) {
//                    try {
//                        System.out.println("pong");
//                        object.notify();
//                        object.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//}

    public static void main(String[] args) throws InterruptedException {
        PingPong pingPong = new PingPong();

        Thread t1 = new Thread(() -> {
            try {
                pingPong.printPing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                pingPong.printPong();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t1.join(10);
        t2.start();
    }
}
