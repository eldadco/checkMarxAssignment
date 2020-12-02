package Pages.Vehicle;

import Pages.Engine.Engine;

public abstract class Vehicle implements Comparable<Vehicle> {
protected int numberOfWheels;
protected Engine engine;

public int compareTo(Vehicle vehicle1) {

    return vehicle1.getAmountOfEnergy().compareTo(this.getAmountOfEnergy());
}
public abstract Integer getNumberOfWheels();
public abstract Double getAmountOfEnergy();
public Engine getEngine() {return engine;}
public abstract String toString();


}
