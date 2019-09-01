package compositionExample;

public class Jet extends Vehicle {

    public Jet(){
        setGoAlgorithm(new FlyingAlgorithm());
    }

}
