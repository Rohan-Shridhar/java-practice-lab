class BMS extends Thread {
    @Override
    public void run() {
        while(true){try {
            System.out.println("BMS College of Engineering");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println( "Thread interrupted.");
        }}
    }
}
class CSE extends Thread {
    @Override
    public void run() {
        while(true){try {
            System.out.println("Computer Science Engineering");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println( "Thread interrupted.");
        }}
    }
}

public class Multithreading {

    public static void main(String[] args) {

        Thread t1 = new BMS();
        Thread t2 = new CSE();

        t1.start(); // starts thread-1
        t2.start(); // starts thread-2
    }
}
