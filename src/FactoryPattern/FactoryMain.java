package FactoryPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Pizza> pizzas = new ArrayList<>();
        // Based on input we will decide which pizza client want to eat
        Scanner sc = new Scanner(System.in);
       
        PizzaFactory pizzaFactory = new PizzaFactory();
        System.out.println("Type of Pizza you want to order");

        while(true){
         
         System.out.println("Currently we have");
         System.out.println("1. Marghretia:MP");
         System.out.println("2. PeppyPanner:PP");
         System.out.println("3. Double Cheese:DP");
         String pizzaName = sc.nextLine();
         pizzas.add(pizzaFactory.makePizza(pizzaName, Size.values()[rand.nextInt(Size.values().length)],
                Crust.values()[rand.nextInt(Crust.values().length)], 
                Arrays.asList(Topping.values()[rand.nextInt(Topping.values().length)],
                Topping.values()[rand.nextInt(Topping.values().length)])));
        
        System.out.println("Do you want to order more: Yes/No");
        String response= sc.nextLine().toLowerCase();
        if(!response.equals("yes")){
            break;
        }
       }

       for(Pizza p: pizzas){
          p.getName();
          p.getCrust();
          p.getSize();
          p.getToppings();
       }
         sc.close();
    }
}
