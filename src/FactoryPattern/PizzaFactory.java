package FactoryPattern;

import java.util.List;

public class PizzaFactory {
    public Pizza makePizza(String pizzaName, Size size, Crust crust, List<Topping> topping){
        

        Pizza pizza  = null;
        if(pizzaName.equals("Marghretia")){
            pizza = new MarghretiaPizza(size, crust, topping);
        }else if(pizzaName.equals("DoubleCheese") ){
            pizza = new DoubleCheesePizza(size, crust, topping);
        }else if(pizzaName.equals("PeppyPanner")){
            pizza = new PeppyPannerPizza(size, crust, topping);
        }else{
            System.out.println("Please select a valid Pizza");   
        }

        return pizza;
    }
}
