package PrototypePattern;

public class Dell implements Company{

    @Override
    public void buildPC(SystemsConfiguration system) {
        System.out.println("Building Started............\nYour Configuration are following:\nProcessor:\t"+system.getProcessor()+
        "\nGraphicCard:\t"+system.getGraphicCard()+"\nRam:\t"+system.getRam()+"GB\nStorage:\t"+system.getStorage()+"TB");
    }
  
}
