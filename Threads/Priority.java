class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread "+Thread.currentThread().getName()+" is running");
        System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
    }
}
public class Priority {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();

        t1.setName("Low");
        t2.setName("High");
        t3.setName("Middle");

        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
    }
}
