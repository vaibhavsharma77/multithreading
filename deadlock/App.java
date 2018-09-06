package deadlock;

public class App {

    public static void main(String[] args) {
        Product product=new Product();
        WorkerThread workerThread=new WorkerThread(product);
        workerThread.start();
        WorkerThread workerThread1=new WorkerThread(product);
        workerThread1.start();

    }
}
