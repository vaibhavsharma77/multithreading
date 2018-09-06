package deadlock;

public class WorkerThread extends Thread {
    Product product;
    public WorkerThread(Product product){
        this.product=product;
    }

    @Override
    public void run() {

        for(int i=0;i<=20;i++){

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+product.method());
        }
    }
}
