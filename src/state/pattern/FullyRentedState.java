package state.pattern;

public class FullyRentedState implements State {

    Automat automat;

    public FullyRentedState(Automat automat){
        this.automat = automat;
    }

    @Override
    public void gotApplication() {
        System.out.println("sorry We are fully rented");
    }

    @Override
    public void checkApplication() {
        System.out.println("sorry We are fully rented");
    }

    @Override
    public void rentApartment() {
        System.out.println("sorry We are fully rented");
    }

    @Override
    public void dispenseKeys() {
        System.out.println("sorry We are fully rented");
    }
}
