package ObserverPattern;

public class ObserverPatternMain {

	public static void main(String[] args) {

		Subject work1 = new WorkDistributer();
		Observer labor1 = new LaborGrabber("Mohit",work1);
		Observer labor2 = new LaborGrabber("Rahul",work1);
		Observer labor3 = new LaborGrabber("Harsh",work1);
		work1.register(labor1);
		work1.register(labor2);
		work1.register(labor3);

		work1.notifyLabor("School Development");
	}

}
