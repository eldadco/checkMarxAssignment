package Pages.Engine;

public class FuelEngine extends Engine {

    public FuelEngine(double amountLeft) {

        this.amountLeft= amountLeft;
    }
    @Override
    public String toString() {
        return ("fuel engine with " + amountLeft + " liters left");
    }
}
