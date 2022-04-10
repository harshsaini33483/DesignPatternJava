package FactoryPattern;

import java.util.List;

public abstract class Pizza {
    private Size size;
    private String name;
    private Crust crust;
    private List<Topping> toppings;

    public void getName(){
        System.out.println("Your have ordered "+name);
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void getSize(){
        System.out.println("Your pizza size preference is "+size.name());
    }
    public void setSize(Size size){
        this.size = size;
    }

    
    public void getCrust(){
        System.out.println("Your pizza crust is "+crust.name());
    }
    public void setCrust(Crust crust){
        this.crust = crust;
    }

    
    public void getToppings(){
        if(toppings.size()==0){
            System.out.println("No Extra Topping");
        }
        System.out.println("Your Pizza has following toppings:");
        for(Topping t: toppings){
            System.out.println(t.name());
        }
    }
    public void setToppings(List<Topping> topping){
        this.toppings = topping;
    }
}

