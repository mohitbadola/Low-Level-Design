package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizzas.BasePizza;
import DecoratorDesignPattern.BasePizzas.Farmhouse;
import DecoratorDesignPattern.BasePizzas.Margherita;
import DecoratorDesignPattern.ToppingDecorators.ExtraCheese;
import DecoratorDesignPattern.ToppingDecorators.Mushroom;

public class Run {

    public static void main(String[] args) {
             BasePizza pizza1 = new Margherita();
        System.out.println( pizza1.cost());


        BasePizza pizza2 = new Mushroom(new ExtraCheese(new Farmhouse()));
        System.out.println(pizza2.cost());

        BasePizza pizza3 = new ExtraCheese(pizza1);
        System.out.println(pizza3.cost());
    }
    
}
