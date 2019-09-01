package compositionExample;

public abstract class Vehicle {

    private GOAlgorithm goAlgorithm;

    public void setGoAlgorithm(GOAlgorithm goAlgorithm) {
        this.goAlgorithm = goAlgorithm;
    }

    public void go(){
        goAlgorithm.go();
    }

}
