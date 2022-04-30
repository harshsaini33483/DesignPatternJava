package BuilderPattern;

public class Car {
    private String engineModel;
    private String carName;
    private String wheels;
    private String interior;

    public Car(CarBuilder builder){
        this.engineModel = builder.getEngineModel();
        this.carName = builder.getCarName();
        this.wheels = builder.getWheels();
        this.interior = builder.getInterior();
    }

    @Override
    public String toString() {
        return "Car [carName=" + carName + ", engineModel=" + engineModel + ", interior=" + interior + ", wheels="
                + wheels + "]";
    } 


    

}
