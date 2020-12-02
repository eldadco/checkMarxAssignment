package Pages.Vehicle;

import Pages.Engine.Engine;

public class MotorCycle extends Vehicle {
    public MotorCycle(int numberOfWheels, Engine engineType){
        this.numberOfWheels = numberOfWheels;
        this.engine = engineType;
    }

    public String toString() {
        return "motorcycle with " + numberOfWheels + " and " + engine.toString();

    }


    public Integer getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public Double getAmountOfEnergy() {
        return engine.getAmountOfEnergy();
    }
}
