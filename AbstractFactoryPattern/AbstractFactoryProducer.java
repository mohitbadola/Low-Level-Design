package AbstractFactoryPattern;

import AbstractFactoryPattern.Factories.AbstractFactory;
import AbstractFactoryPattern.Factories.EconomicCarFactory;
import AbstractFactoryPattern.Factories.LuxuryCarFactory;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryType(String value){
        if(value.equals("Economic")){
            return new EconomicCarFactory();
        }
        else if(value.equals("Luxury")||value.equals("Premium")){
            return new LuxuryCarFactory();
        }
        return null;
    }
    
}
