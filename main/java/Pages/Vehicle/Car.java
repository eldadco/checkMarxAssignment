package Pages.Vehicle;


import Pages.Engine.Engine;

public class Car extends Vehicle {
    public Car(int numberOfWheels, Engine engineType){
        this.numberOfWheels = numberOfWheels;
        this.engine = engineType;
    }

    public Integer getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public Double getAmountOfEnergy() {
        return engine.getAmountOfEnergy();
    }




    public String toString() {
        return "car with " + numberOfWheels + " and " + engine.toString();

    }

}
