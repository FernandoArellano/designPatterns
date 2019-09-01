package state.pattern;

public class Automat implements AutomatInterface {

    private int count;
    private State waitingState;
    private State gotApplicationState;
    private State rentedAppartmentState;
    private State fullyRentedState;
    private State state;

    public Automat(int n){
        this.count = n;
        waitingState = new WaitingState(this);
        gotApplicationState = new GotApplicationState(this);
        rentedAppartmentState = new RentApartmentState(this);
        fullyRentedState = new FullyRentedState(this);
        this.state = waitingState;
    }

    @Override
    public void gotApplication() {
        this.state.gotApplication();
    }

    @Override
    public void checkApplication() {
        this.state.checkApplication();
    }

    @Override
    public void rentAppartment() {
        this.state.rentApartment();
        this.state.dispenseKeys();
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getWaitingState() {
        return waitingState;
    }

    @Override
    public State getGotApplicationState() {
        return gotApplicationState;
    }

    @Override
    public State getApartmentRentedState() {
        return rentedAppartmentState;
    }

    @Override
    public State getFullyRentedState() {
        return fullyRentedState;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }
}
