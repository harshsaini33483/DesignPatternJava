package ObserverPattern;
// Know as Publisher/Subject
public interface Subject {

	public void register(Observer labor);
	public void unRegister(Observer labor);
	public void notifyLabor(String work);
}
