package Pages.Engine;

public abstract class Engine {
    protected double amountLeft;

    public double getAmountOfEnergy() {
        return amountLeft;
    }

    public abstract String toString();

}
