package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
   
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
