package StrategyDesignPattern;

import StrategyDesignPattern.Vehicles.GoodsVehicle;
import StrategyDesignPattern.Vehicles.OffRoadVehicle;
import StrategyDesignPattern.Vehicles.SportsVehicle;
import StrategyDesignPattern.Vehicles.Vehicle;

public class Run {
    public static void main(String[] args) {
        Vehicle vehicle1 = new GoodsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new OffRoadVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new SportsVehicle();
        vehicle3.drive();
    }   
}
