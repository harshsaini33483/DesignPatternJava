package ObserverPattern;

import java.security.SecureRandom;

public class LaborGrabber implements Observer {

	String laborName;
	private int laborId;
	private Subject work;

	public LaborGrabber(String laborName, Subject work) {
		this.work = work;
		this.laborName = laborName;
		laborId = new SecureRandom().nextInt();
		System.out.println("New Labor Registered with following details\nName: "+laborName+"\nLaborId:"+this.laborId);
		work.register(this);
	}
	
	@Override
	public void update(String workName) {
		System.out.println(laborName+" Goverment announced "+workName);
	}

}
