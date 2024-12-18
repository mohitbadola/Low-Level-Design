package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Cars.Car;

public interface AbstractFactory {

    public Car getPrice(int price);

}
