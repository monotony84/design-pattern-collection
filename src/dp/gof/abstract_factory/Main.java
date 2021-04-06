package dp.gof.abstract_factory;

import dp.gof.abstract_factory.factory.Factory;
import dp.gof.abstract_factory.factory.Link;
import dp.gof.abstract_factory.factory.Page;
import dp.gof.abstract_factory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java util Main Class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
        Link us_yahoo = factory.createLink("Yahoo!", "http://yahoo.com/");

        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://wwww.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayname = factory.createTray("新聞");
        trayname.add(asahi);
        trayname.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("サーチエンジン");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "Y.Tomono");
        page.add(trayname);
        page.add(traysearch);
        page.output();
    }
}
