package StratergyPattern;

public class Transport {
    
    private Mode mode;
    private Type type;
    private Integer speed;

    public Transport(Mode mode, Type type, Integer speed) {
    	this.mode = mode;
    	this.type =type;
    	this.speed = speed;
    }
    public void showSpeed() {
    	System.out.println("Will transport at "+speed+" Km/h");
    }

    public void showType() {
    	System.out.println("Will Transport only "+ type.luggageType());
    }

    public void showMode() {
    	System.out.println("Will transport by "+mode.name());
    }

    
}
