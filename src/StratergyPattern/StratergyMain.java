package StratergyPattern;

public  class StratergyMain {
	public static void main(String[] args) {
		
	    Transport transport1 = new Transport(Mode.Air, new HumanType(), 300);
	    	
	    Transport transport2 = new Transport(Mode.Road, new AnimalType(), 100);

	    Transport transport3 = new Transport(Mode.Water, new GoodsType(), 150);
	    
	    transport1.showType();
	    transport1.showSpeed();
	    transport1.showMode();
	    
	    transport2.showType();
	    transport2.showSpeed();
	    transport2.showMode();
	    
	    transport3.showType();
	    transport3.showSpeed();
	    transport3.showMode();
	
	}    
}
