package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
    
}
