package BuilderPattern;

public class CarBuilder {
    private String engineModel;
    private String carName;
    private String wheels;
    private String interior;

    public CarBuilder engineModel(String engineModel){
        this.engineModel = engineModel;
        return this;
    }

    public CarBuilder carName(String carName){
        this.carName = carName;
        return this;
    }
    public CarBuilder wheels(String wheels){
        this.wheels = wheels;
        return this;
    }
    public CarBuilder interior(String interior){
        this.interior = interior;
        return this;
    }

    public Car build(){
        return new Car(this);
    }

    public String getEngineModel() {
        return engineModel;
    }

    public String getCarName() {
        return carName;
    }
    public String getWheels() {
        return wheels;
    }

    public String getInterior() {
        return interior;
    }

}
