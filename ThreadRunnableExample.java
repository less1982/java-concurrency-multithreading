package javathreads;

public class ThreadRunnableExample implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Run #" + i + " on " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // keeping simple for assignment
            }
        }
    }
}
