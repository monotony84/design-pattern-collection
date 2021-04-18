package dp.gof.observer;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver:" + numberGenerator.getNumber());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}