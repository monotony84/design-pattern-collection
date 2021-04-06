package dp.gof.abstract_factory.tablefactory;

import dp.gof.abstract_factory.factory.Factory;
import dp.gof.abstract_factory.factory.Link;
import dp.gof.abstract_factory.factory.Page;
import dp.gof.abstract_factory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
