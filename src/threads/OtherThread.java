package threads;

public class OtherThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Hello World Threads----------------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
