package ObserverPattern;
// Know as Publisher/Subject
public interface Work {

	public void register(Labor labor);
	public void unRegister(Labor labor);
	public void notifyLabor(String work);
}
