package compositionExample;

public class TestMain {
    public static void main(String [] args){

        Vehicle car = new Car();

        Vehicle jet = new Jet();

        car.go();
        jet.go();
        jet.setGoAlgorithm(new DrivingAlgorithm());
        jet.go();
    }
}
