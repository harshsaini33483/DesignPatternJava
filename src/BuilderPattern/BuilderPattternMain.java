package BuilderPattern;

public class BuilderPattternMain {
    public static void main(String[] args) {
        Car car = new CarBuilder().carName("Maruti").engineModel("v9").wheels("Gold Alloy").interior("Black Leather").build();
        System.out.println( car.toString());
    }
}
