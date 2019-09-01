package observer.pattern;

public class Boss implements Observer {
    @Override
    public void update(String operation, String record) {
        System.out.println("The boss says "+ operation + " was " +record);
    }
}
