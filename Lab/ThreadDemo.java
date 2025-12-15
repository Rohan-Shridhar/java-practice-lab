class BMS extends Thread{
    public void run(){
        while (true) { 
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class CSE extends Thread{
    public void run(){
        while (true) { 
            System.out.println("CSE");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        BMS bms=new BMS();
        CSE cse=new CSE();
        bms.start();
        cse.start();
    }
}
