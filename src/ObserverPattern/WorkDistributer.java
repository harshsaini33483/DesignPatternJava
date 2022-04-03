package ObserverPattern;

import java.util.HashSet;
import java.util.Set;

public class WorkDistributer implements Work {

	private Set<Labor> workerSet;
	
	public WorkDistributer() {
		workerSet = new HashSet<>();
	}
	
	@Override
	public void register(Labor obs) {
		workerSet.add(obs);
	}

	@Override
	public void unRegister(Labor obs) {
		workerSet.remove(obs);
		System.out.println("Observer deleted");

	}

	@Override
	public void notifyLabor(String work) {
		for(Labor ob: workerSet) {
			ob.update(work);
		}

	}
}
