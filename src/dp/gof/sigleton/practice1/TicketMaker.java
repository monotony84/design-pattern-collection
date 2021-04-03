package dp.gof.sigleton.practice1;

public class TicketMaker {
    private static TicketMaker tm = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
        System.out.println("Singleton生成");
    }

    public static TicketMaker getInstance() {
        return tm;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
