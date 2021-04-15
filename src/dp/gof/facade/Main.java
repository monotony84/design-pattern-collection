package dp.gof.facade;

import dp.gof.facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("monotony@example.com", "welcome.html");
    }
}
