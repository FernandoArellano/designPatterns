package command.pattern;

public class ShutDownCommand implements Command {

    Receiver receiver;

    public ShutDownCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconect();
    }
}
