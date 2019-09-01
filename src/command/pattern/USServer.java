package command.pattern;

public class USServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("Connecting to the Us Server");
    }

    @Override
    public void diagnose() {
        System.out.println("Diagnosing the Us Server");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down the Us Server");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting the Us Server");
    }

    @Override
    public void disconect() {
        System.out.println("Disconnecting from the Us Server");
    }
}
