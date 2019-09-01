package compositionExample;

public class Car extends Vehicle {

    public Car(){
        setGoAlgorithm(new DrivingAlgorithm());
    }

}
