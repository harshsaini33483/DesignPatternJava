package ObserverPattern;

public class ObserverPatternMain {

	public static void main(String[] args) {

		Work work1 = new WorkDistributer();
		Labor labor1 = new LaborGrabber("Mohit",work1);
		Labor labor2 = new LaborGrabber("Rahul",work1);
		Labor labor3 = new LaborGrabber("Harsh",work1);
		work1.register(labor1);
		work1.register(labor2);
		work1.register(labor3);

		work1.notifyLabor("School Development");
	}

}
