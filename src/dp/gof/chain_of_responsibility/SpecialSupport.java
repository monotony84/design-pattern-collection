package dp.gof.chain_of_responsibility;

public class SpecialSupport extends Support {

    public int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
