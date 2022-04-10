package FactoryPattern;

import java.util.List;

public class MarghretiaPizza extends Pizza{
    public MarghretiaPizza(Size size, Crust crust, List<Topping> topping){
        setCrust(crust);
        setName("Marghretia");
        setSize(size);
        setToppings(topping);
    }
}
