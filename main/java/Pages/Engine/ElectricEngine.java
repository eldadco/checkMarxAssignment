package Pages.Engine;

public class ElectricEngine extends Engine{
    public ElectricEngine(double amountLeft){
        this.amountLeft= amountLeft;
    }

    @Override
    public String toString() {
        return ("electric engine that have " +  amountLeft + "% left in the battery");
    }
}
