public class MyThread extends Thread {

    public MyThread(ThreadGroup mainGroup, String s) {
        super(mainGroup, s);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("%s стартует: ", Thread.currentThread().getName());
                System.out.println("Привет чуваки");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}
