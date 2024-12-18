package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Cars.Car;
import AbstractFactoryPattern.Cars.EconomicCar1;
import AbstractFactoryPattern.Cars.EconomicCar2;

public class EconomicCarFactory implements AbstractFactory{

    @Override
    public Car getPrice(int price) {
        if(price <=30000){
            return new EconomicCar1();
        }
        else if(price > 30000){
            return new EconomicCar2();
        }
        return null;
    }
    
}
