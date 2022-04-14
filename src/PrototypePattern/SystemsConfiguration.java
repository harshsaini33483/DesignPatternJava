package PrototypePattern;

public class SystemsConfiguration implements Cloneable{
    String processor;
    String graphicCard;
    Integer ram;
    Integer storage;

    public SystemsConfiguration(String processor, String graphicCard, Integer ram, Integer storage){
        this.graphicCard = graphicCard;
        this.processor = processor;
        this.ram =ram;
        this.storage = storage;
    }


    @Override
    protected SystemsConfiguration clone() throws CloneNotSupportedException {
        SystemsConfiguration newSystem = new SystemsConfiguration(this.processor, this.graphicCard, this.ram, this.storage);
        return newSystem;
    }


    public String getProcessor() {
        return processor;
    }
    public String getGraphicCard() {
        return graphicCard;
    }
    public Integer getRam() {
        return ram;
    }
    public Integer getStorage() {
        return storage;
    }


    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }


    public void setRam(Integer ram) {
        this.ram = ram;
    }


    public void setStorage(Integer storage) {
        this.storage = storage;
    }
    
    
}
