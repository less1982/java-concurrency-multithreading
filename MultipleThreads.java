package javathreads;

public class MultipleThreads {
    public static void main(String[] args) {
        ThreadRunnableExample task = new ThreadRunnableExample();
        Thread t1 = new Thread(task, "thread1");
        Thread t2 = new Thread(task, "thread2");
        t1.start();
        t2.start();
    }
}
