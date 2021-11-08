import java.util.concurrent.Callable;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Producer p1 = new Producer(warehouse);
        Consumer c1 = new Consumer(warehouse);
        p1.start();
        c1.start();
    }
}
