package state.pattern;

public class RentApartmentState implements State {

    Automat automat;

    public RentApartmentState(Automat automat){
        this.automat = automat;
    }

    @Override
    public void gotApplication() {
        System.out.println("We are already renting an appartment");
    }

    @Override
    public void checkApplication() {
        System.out.println("We are already renting an appartment");
    }

    @Override
    public void rentApartment() {
        automat.setCount(automat.getCount()  - 1);
        System.out.println("We are renting you an appartment");
    }

    @Override
    public void dispenseKeys() {
        if(automat.getCount() <= 0){
            automat.setState(automat.getFullyRentedState());
        }
        else{
            automat.setState(automat.getWaitingState());
        }
        System.out.println("Here are your keys");
    }
}
