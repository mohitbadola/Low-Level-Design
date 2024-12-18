package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Cars.Car;
import AbstractFactoryPattern.Cars.LuxuryCar1;
import AbstractFactoryPattern.Cars.LuxuryCar2;

public class LuxuryCarFactory implements AbstractFactory{

    @Override
    public Car getPrice(int price) {
        if(price>=1000000 && price<=2000000){
            return new LuxuryCar1();
        }
        if(price>2000000){
            return new LuxuryCar2();
        }
        return null;
    }
    
    
}
