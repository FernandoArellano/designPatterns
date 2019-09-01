package observer.pattern;

public class Client implements Observer {
    @Override
    public void update(String operation, String record) {
        System.out.println("Client says the " + operation + " was " + record);
    }
}
