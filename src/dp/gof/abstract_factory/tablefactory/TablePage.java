package dp.gof.abstract_factory.tablefactory;

import dp.gof.abstract_factory.factory.Item;
import dp.gof.abstract_factory.factory.Page;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<!DOCTYPE html>");
        buffer.append("<html><head><meta charset=\"utf-8\"/><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" +  title + "</h1>\n");
        buffer.append("<table width = \"80%\" border=\"3\">\n");

        Iterator it = content.iterator();
        while(it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
