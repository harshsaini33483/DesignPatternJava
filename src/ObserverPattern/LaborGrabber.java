package ObserverPattern;

import java.security.SecureRandom;

public class LaborGrabber implements Labor {

	String laborName;
	private int laborId;
	private Work work;

	public LaborGrabber(String laborName, Work work) {
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
