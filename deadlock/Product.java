package deadlock;

public class Product {

    int i = 0;


    public synchronized int method() {
        i++;
        return i;
    }
}
