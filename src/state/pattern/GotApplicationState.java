package state.pattern;

import java.util.Random;

public class GotApplicationState implements State {

    Automat automat;
    Random random;

    public GotApplicationState(Automat automat){
        this.automat = automat;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public void gotApplication() {
        System.out.println("We already got an application");
    }

    @Override
    public void checkApplication() {
        int yesno = random.nextInt() % 10;
        if(yesno > 4 && automat.getCount() > 0){
            automat.setState(automat.getApartmentRentedState());
            System.out.println("Congrats it was approved");
        }
        else{
            automat.setState(automat.getWaitingState());
            System.out.println("Sorry it was not approved");
        }
    }

    @Override
    public void rentApartment() {
        System.out.println("You must wait for the application check");
    }

    @Override
    public void dispenseKeys() {
        System.out.println("You must wait for the application check");
    }
}
