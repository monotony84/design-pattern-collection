package dp.gof.interpreter;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
