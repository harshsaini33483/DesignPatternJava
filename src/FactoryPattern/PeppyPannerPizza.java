package FactoryPattern;

import java.util.List;

public class PeppyPannerPizza  extends Pizza{

    public PeppyPannerPizza(Size size, Crust crust, List<Topping> topping){
        setCrust(crust);
        setName("PennyPanner");
        setSize(size);
        setToppings(topping);
    }
}
