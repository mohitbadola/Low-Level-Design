package AbstractFactoryPattern;

import AbstractFactoryPattern.Cars.Car;
import AbstractFactoryPattern.Factories.AbstractFactory;

//It's factory of factory

public class Main {

    public static void main(String[] args) {

        AbstractFactoryProducer abstractFactoryProducerObj = new AbstractFactoryProducer();

        AbstractFactory abstractFactoryObj1 = abstractFactoryProducerObj.getFactoryType("Premium");
        Car carObj1 = abstractFactoryObj1.getPrice(5000000);
        System.out.println(carObj1.getTopSpeed());

        AbstractFactory abstractFactoryObj2 = abstractFactoryProducerObj.getFactoryType("Economic");
        Car carObj2 = abstractFactoryObj2.getPrice(5000);
        System.out.println(carObj2.getTopSpeed());
    }
    
}
