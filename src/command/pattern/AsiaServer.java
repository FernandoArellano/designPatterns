package command.pattern;

public class AsiaServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("Connected to Asia Server");
    }

    @Override
    public void diagnose() {
        System.out.println("Diagnosing Asia Server");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down Asia Server");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting Asia Server");
    }

    @Override
    public void disconect() {
        System.out.println("Disconnecting from Asia Server");
    }
}
