package state.pattern;

public class WaitingState implements State {

    Automat automat;

    public WaitingState(Automat automat){
        this.automat = automat;
    }

    @Override
    public void gotApplication() {
        automat.setState(automat.getGotApplicationState());
        System.out.println("Got an application");
    }

    @Override
    public void checkApplication() {
        System.out.println("First you need to submit an application");
    }

    @Override
    public void rentApartment() {
        System.out.println("First you need to submit an application");
    }

    @Override
    public void dispenseKeys() {
        System.out.println("First you need to submit an application");
    }
}
