package ObserverPattern;

import java.util.HashSet;
import java.util.Set;

public class WorkDistributer implements Subject {

	private Set<Observer> workerSet;
	
	public WorkDistributer() {
		workerSet = new HashSet<>();
	}
	
	@Override
	public void register(Observer obs) {
		workerSet.add(obs);
	}

	@Override
	public void unRegister(Observer obs) {
		workerSet.remove(obs);
		System.out.println("Observer deleted");

	}

	@Override
	public void notifyLabor(String work) {
		for(Observer ob: workerSet) {
			ob.update(work);
		}

	}
}
