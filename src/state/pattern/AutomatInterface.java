package state.pattern;

public interface AutomatInterface {

    public void gotApplication();
    public void checkApplication();
    public void rentAppartment();
    public void setState(State state);
    public State getWaitingState();
    public State getGotApplicationState();
    public State getApartmentRentedState();
    public State getFullyRentedState();
    public int getCount();
    public void setCount(int count);
}
