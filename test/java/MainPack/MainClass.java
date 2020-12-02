package MainPack;

import Pages.Engine.ElectricEngine;
import Pages.Engine.FuelEngine;
import Pages.Vehicle.Car;
import Pages.Vehicle.MotorCycle;
import Pages.Vehicle.Vehicle;

import java.util.*;

public class MainClass {
    public static void main(String[] args)
    {

        Car car1 = new Car(4,new FuelEngine(20));
        Car car2 = new Car(4,new ElectricEngine(40));
        MotorCycle motorCycle1 = new MotorCycle(2,new FuelEngine(5));
        MotorCycle motorCycle2 = new MotorCycle(2,new ElectricEngine(80));
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(motorCycle1);
        vehicles.add(motorCycle2);
        vehicles= sort(vehicles);
        for(Vehicle vehicle : vehicles)
        {
            System.out.println(vehicle.toString());
        }
    }

    public static List<Vehicle> sort(List<Vehicle> vehicles) {
        List<Vehicle> fuelEngines = new ArrayList<Vehicle>();
        List<Vehicle> electricEngines = new ArrayList<Vehicle>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getEngine() instanceof FuelEngine) {
                fuelEngines.add(vehicle);

            } else if (vehicle.getEngine() instanceof ElectricEngine) {
                electricEngines.add(vehicle);
            }
        }
        Collections.sort(fuelEngines);
        Collections.sort(electricEngines);
        fuelEngines.addAll(electricEngines);
        return fuelEngines;

    }
}
