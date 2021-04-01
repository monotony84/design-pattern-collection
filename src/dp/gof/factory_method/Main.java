package dp.gof.factory_method;

import dp.gof.factory_method.framework.Factory;
import dp.gof.factory_method.framework.Product;
import dp.gof.factory_method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("monotony");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("佐藤");

        card1.use();
        card2.use();
        card3.use();
    }
}
