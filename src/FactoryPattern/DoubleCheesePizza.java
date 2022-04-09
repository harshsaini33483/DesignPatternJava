package FactoryPattern;

import java.util.List;

public class DoubleCheesePizza extends Pizza {
    public DoubleCheesePizza(Size size, Crust crust, List<Topping> topping){
        setCrust(crust);
        setName("DoubleCheese");
        setSize(size);
        setToppings(topping);
    }
}
