package command.pattern;

public interface Receiver {

    public void connect();
    public void diagnose();
    public void shutdown();
    public void reboot();
    public void disconect();
}
