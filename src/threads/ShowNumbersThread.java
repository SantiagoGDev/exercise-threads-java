package threads;

public class ShowNumbersThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Numero:"+i);
        }
    }
    
}
