package dp.gof.prototype;

import dp.gof.prototype.framework.Manager;
import dp.gof.prototype.framework.Product;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("hello, world.");
    }
}
