package DecoratorDesignPattern.ToppingDecorators;

import DecoratorDesignPattern.BasePizzas.BasePizza;

public class Mushroom extends ToppingDecorator{
     BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }


    @Override
    public int cost() {
        return pizza.cost()+15;
    }
}
