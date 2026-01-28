

class Callme{
    synchronized void call(String msg){
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    Caller(Callme target, String msg){
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        synchronized(target){
            target.call(msg);
        }
    }
}
public class Sync {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target,"BMS");
        Caller ob2 = new Caller(target,"College");
        Caller ob3 = new Caller(target,"of");
        Caller ob4 = new Caller(target,"Engineering");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            ob4.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }
}
